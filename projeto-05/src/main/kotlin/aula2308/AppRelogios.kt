package aula2308

import javax.swing.JOptionPane

fun main() {
    // estamos criando um instância de Relogio
    // estamos instanciando um Relogio
    // estamos criando um objeto do tipo Relogio
    val meuRelogio = Relogio()

    // alterando os atributos do objeto 'meuRelogio'
    meuRelogio.modelo = "Casio"
    meuRelogio.preco = 300.0
    meuRelogio.horas = 15
    meuRelogio.minutos = 30
    meuRelogio.segundos = 22

    JOptionPane.showMessageDialog(null,
        "O modelo do 1º relógio é ${meuRelogio.modelo}")

    JOptionPane.showMessageDialog(
                    null, meuRelogio.verHora())

//    JOptionPane.showMessageDialog(
//                    null, "Hora atual: ${meuRelogio.verHora()}")

    JOptionPane.showMessageDialog(null, meuRelogio.validar())

    val segundoRelogio = Relogio()
    segundoRelogio.modelo = JOptionPane.showInputDialog("Qual o modelo?")
    segundoRelogio.preco = JOptionPane.showInputDialog("Qual o preço?").toDouble()
    segundoRelogio.horas = JOptionPane.showInputDialog("Qual a hora?").toInt()
    segundoRelogio.minutos = JOptionPane.showInputDialog("Qual o minuto?").toInt()
    segundoRelogio.segundos = JOptionPane.showInputDialog("Qual o segundo?").toInt()

    JOptionPane.showMessageDialog(null, segundoRelogio.validar())
    JOptionPane.showMessageDialog(null,
        "Hora no 2º relógio: ${segundoRelogio.verHora()}")

}