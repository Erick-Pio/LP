package app

import configuracao.Conexao
import dominio.Carro
import repositorio.CarroRepositorio
import javax.swing.JOptionPane.showInputDialog
import javax.swing.JOptionPane.showMessageDialog

fun main() {
    val jdbcTemplate = Conexao().getJdbcTemplate()
    val repositorio = CarroRepositorio(jdbcTemplate)

    val cadastros = showInputDialog(
                        "Quantos carros quer cadastrar?").toInt()

    for (cadastro in 1..cadastros) {
        val modelo = showInputDialog("Qual modelo?")
        val ano = showInputDialog("Qual ano?").toInt()
        val potencia = showInputDialog("Qual potência?").toDouble()

        val novoCarro = Carro(0, modelo, ano, potencia)
        repositorio.inserir(novoCarro)
    }

    val carros = repositorio.listar()

    var mensagemTodos = "${carros.size} carros cadastrados: \r\n"
    carros.forEach {
        mensagemTodos += "id: ${it.idCarro} - ${it.modelo}, ano ${it.ano}, potência de ${it.potencia} \r\n"
    }
    showMessageDialog(null, mensagemTodos)

    val idRever = showInputDialog(
        "Qual carro quer rever? Digite um id válido").toInt()

    if (repositorio.idCarroValido(idRever)) {
        val carro = repositorio.recuperar(idRever)
        showMessageDialog(null,
            "id: ${carro.idCarro} - ${carro.modelo}, ano ${carro.ano}, potência de ${carro.potencia}")
    } else {
        showMessageDialog(null,
            "Carro de id $idRever não encontrado")
    }

    val seminovos = repositorio.listarSeminovos()

    var mensagemSeminovos = "${seminovos.size} carros seminovos: \r\n"
    seminovos.forEach {
        mensagemSeminovos += "id: ${it.idCarro} - ${it.modelo}, ano ${it.ano}, potência de ${it.potencia} \r\n"
    }
    showMessageDialog(null, mensagemSeminovos)

    val seminovosPotentes = repositorio.listarSeminovosPotentes()

    var mensagemPotentes = "${seminovosPotentes.size} carros seminovos: \r\n"
    seminovosPotentes.forEach {
        mensagemPotentes += "id: ${it.idCarro} - ${it.modelo}, ano ${it.ano}, potência de ${it.potencia} \r\n"
    }
    showMessageDialog(null, mensagemPotentes)

    val modeloExcluir = showInputDialog(
        "Qual o modelo de carro que deseja excluir do banco?")

    val excluidos = repositorio.excluirPorModelo(modeloExcluir)
    if (excluidos > 0) {
        showMessageDialog(null, "$excluidos carros excluídos")
    } else {
        showMessageDialog(null, "Nenhum carro excluído")
    }
}