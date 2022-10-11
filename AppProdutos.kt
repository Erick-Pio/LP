import javax.swing.JOptionPane
import javax.swing.JOptionPane.showInputDialog
import javax.swing.JOptionPane.showMessageDialog

fun main() {
    val produto1 = Produto()

    val novoNome = showInputDialog("Qual o nome?")
    val novoPreco = showInputDialog("Qual o preço?").toDouble()
    val novoBrinde = showInputDialog("É brinde? 1 - Sim / 2 - Não")

    var ehBrinde = false
    if (novoBrinde == "1") {
        ehBrinde = true
    }
    if (novoBrinde == "2") {
        ehBrinde = false
    }

    produto1.nome = novoNome
    produto1.preco = novoPreco
    produto1.brinde = ehBrinde

    showMessageDialog(null,
"O produto ${produto1.nome} custa R$${"%.2f".format(produto1.preco)}")
}