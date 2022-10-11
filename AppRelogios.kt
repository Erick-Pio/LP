import javax.swing.JOptionPane
import javax.swing.JOptionPane.showInputDialog
import javax.swing.JOptionPane.showMessageDialog

fun main() {
    val horas = showInputDialog("Horas?").toInt()
    val minutos = showInputDialog("Minutos?").toInt()
    val segundos = showInputDialog("Segundos?").toInt()

    val relogioA = Relogio(horas, minutos, segundos)

    val horasAdicionar = showInputDialog("Quantas horas a mais?").toInt()
    val minutosAdicionar = showInputDialog("Quantos minutos a mais?").toInt()
    val segundosAdicionar = showInputDialog("Quantos segundos a mais?").toInt()

    relogioA.adicionarTempo(horasAdicionar, minutosAdicionar, segundosAdicionar);

    showMessageDialog(null, relogioA.horaAtual())
}