import javax.swing.JOptionPane
import javax.swing.JOptionPane.showInputDialog
import javax.swing.JOptionPane.showMessageDialog


fun main() {
    questaoB() // invoque a função questaoB()
    questaoC() // invoque a função questaoC()
}

fun questaoB() {
    val linha = showInputDialog("Linha?")
    val menor = showInputDialog("Tempo da menor volta").toInt()
    val maior = showInputDialog("Tempo da maior volta").toInt()

    val media = (menor + maior) / 2

    showMessageDialog(null,
        "A linha $linha leva em média $media minutos/volta")
}

fun questaoC() {
    val kiBase = showInputDialog("Qual o KI base do Sayajin?").toDouble()

    showMessageDialog(null, "KI c/ SSJ: ${kiBase * 50}")
    showMessageDialog(null, "KI c/ SSJ2: ${kiBase * 100}")
    showMessageDialog(null, "KI c/ SSJ3: ${kiBase * 200}")
    showMessageDialog(null, "KI c/ God: ${kiBase * 500}")

}

fun questaoG() {
    val precoBase = showInputDialog("Preço base p/ km").toDouble()
    val distancia = showInputDialog("Distância da corrida em km").toDouble()
    val volume = showInputDialog("Volume de solicitações, de 0 a 10").toInt()

    if (volume < 0 || volume > 10) {
        showMessageDialog(null, "Volume inválido!")
        return
    }

    val tarifaBase = precoBase * distancia

    val tarifa = when (volume) {
        in 0..2 -> tarifaBase
        in 3..7 -> tarifaBase * 1.3
        in 8..10 -> tarifaBase * 1.8
        else -> 0
    }

    val tarifaOutroJeito = when (volume) {
        in 3..7 -> tarifaBase * 1.3
        in 8..10 -> tarifaBase * 1.8
        else -> tarifaBase
    }
    
    val tarifaOutroJeitoDeNovo = tarifaBase * when (volume) {
        in 3..7 -> 1.3
        in 8..10 -> 1.8
        else -> 1.0
    }

    showMessageDialog(null, "Tarifa cobrada: $tarifa")

}