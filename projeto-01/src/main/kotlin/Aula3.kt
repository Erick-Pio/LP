import javax.swing.JOptionPane

fun main() {
    cidade() // aqui estamos INVOCANDO a função
    dobro(3.5) // função com parâmetro
}

// posso ter várias funções no arquivo kotlin
// e todas podem ser chamadas pela main()
fun cidade() {
    val cidade = JOptionPane.showInputDialog("Sua cidade")
    println("Sua cidade é $cidade")
}

// função com 1 parâmetro: "numero" do tipo Double (número real)
fun dobro(numero:Double) {
    println("O dobro de $numero é ${numero * 2}")
}