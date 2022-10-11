import javax.swing.JOptionPane

fun main() {

    val cidade = JOptionPane.showInputDialog("Sua cidade")
    println("Sua cidade é $cidade")

    // solicite um número e exiba no console o dobro dele
    val numero = JOptionPane.showInputDialog("Digite um número")
    // todo valor que recebemos de uma JOptionPane.showInputDialog()
    // é uma String (ou seja, texto)

    // se quisermos tratar o valor com número, podemos converter ele
    // ex: para número real: .toDouble()
    // ex: para número inteiro: .toInt()
    println("O dobro de $numero é ${numero.toDouble() * 2}")
    println("O dobro de $numero é ${numero.toInt() * 2}")

    // podemos ainda fazer a conversão logo na leitura
    val filhos =
    JOptionPane.showInputDialog("Quantos filhos?").toInt()

    println("Você terá ${filhos + 1} filhos em 9 meses")

    JOptionPane.showMessageDialog(null, "Janela dahora!")
}