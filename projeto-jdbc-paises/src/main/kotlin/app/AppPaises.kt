package app

import configuracao.Conexao
import dominio.Pais
import repositorio.PaisRepositorio
import javax.swing.JOptionPane

fun main() {
    val jdbcTemplate = Conexao().getJdbcTemplate()
    val paisRepositorio = PaisRepositorio(jdbcTemplate)

    val excluir = JOptionPane.showInputDialog(
        "Digite 1 para excluir tudo de paises") == "1"
    if (excluir) {
        paisRepositorio.excluirTodos()
    }

    val novoNome = JOptionPane.showInputDialog("Nome do pais")
    val novaPopulacao = JOptionPane.showInputDialog("População?").toInt()
    val novoPais = Pais(0, novoNome, novaPopulacao)

    paisRepositorio.inserir(novoPais)

    val paises = paisRepositorio.listar()
    var consulta = "Países cadastrados:  \r\n\r\n"

    paises.forEach {
        consulta += "${it.id} - ${it.nome}, população: ${it.populacao} habitantes"
        consulta += "\r\n"
    }
    JOptionPane.showMessageDialog(null, consulta)

    val idConsulta = JOptionPane.showInputDialog("id para consultar").toInt()
    val paisEncontrado = paisRepositorio.recuperar(idConsulta)
    JOptionPane.showMessageDialog(null, paisEncontrado)

    val idExclusao = JOptionPane.showInputDialog("id para excluir").toInt()
    val excluidos = paisRepositorio.excluir(idExclusao)
    if (excluidos > 0) {
        JOptionPane.showMessageDialog(null, "Pais $idExclusao excluido!")
    } else {
        JOptionPane.showMessageDialog(null, "Pais não encontrado :(")
    }
}