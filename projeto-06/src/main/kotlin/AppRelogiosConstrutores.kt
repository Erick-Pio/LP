import javax.swing.JOptionPane
import javax.swing.JOptionPane.showMessageDialog

fun main() {

    val relogioX = Relogio(10, 25, 30)
    val relogioY = Relogio(10, 25)
    val relogioZ = Relogio(10)
    val relogioW = Relogio()

    showMessageDialog(null, relogioX.horaAtual())
    showMessageDialog(null, relogioY.horaAtual())
    showMessageDialog(null, relogioZ.horaAtual())
    showMessageDialog(null, relogioW.horaAtual())

    val relogioSoMinutos = Relogio(minutos = 12)
    showMessageDialog(null, relogioSoMinutos.horaAtual())

    val relogioMinutosSegundos = Relogio(segundos = 49, minutos = 12)
    showMessageDialog(null, relogioMinutosSegundos.horaAtual())

}