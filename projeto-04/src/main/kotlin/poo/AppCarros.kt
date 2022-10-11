package poo

import javax.swing.JOptionPane

fun main() {
    val carroA = Carro()
    carroA.modelo = JOptionPane.showInputDialog("Qual o modelo?")

    val mensagem = "O 1º carro é um ${carroA.modelo} e está na marcha ${carroA.marcha}"
    JOptionPane.showMessageDialog(null, mensagem)

    val situacao = if (carroA.ligado) "ligado" else "desligado"
    val mensagem2 = "O 1º carro está $situacao"
    JOptionPane.showMessageDialog(null, mensagem2)
}