package aula2308.segundaparte

import javax.swing.JOptionPane
import javax.swing.JOptionPane.showInputDialog
import javax.swing.JOptionPane.showMessageDialog

fun main() {
    val pedido1 = PedidoPizza()
    pedido1.sabor = showInputDialog("Sabor?")
    pedido1.preco = showInputDialog("Preço?").toDouble()
    pedido1.quantidadeAmigos = showInputDialog("Amigos?").toInt()

    val meuCupom = showInputDialog("Cupom?")
    pedido1.validarCupom(meuCupom)

    val meuCupom2 = showInputDialog("2o. Cupom?")
    pedido1.validarCupom(meuCupom2)

    showMessageDialog(null, pedido1.descrever())

    val precoTela = "%.2f".format(pedido1.obterValorPorAmigo())
    showMessageDialog(null,
        "Cada amigo vai pagar R$${precoTela}")

    showMessageDialog(null, pedido1.obterCuponsUsados())
}