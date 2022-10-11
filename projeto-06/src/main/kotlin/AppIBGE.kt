import javax.swing.JOptionPane

fun main() {

    val pessoa1 = Cidadao()
    pessoa1.nome = "Elizabeth II"
    pessoa1.idade = 96
    pessoa1.renda = 5_000_000.0

    val pessoa2 = Cidadao()
    pessoa2.nome = "Lady Gaga"
    pessoa2.idade = 38
    pessoa2.renda = 33_000_000.0

    val pessoas = mutableListOf<Cidadao>(pessoa1, pessoa2)

    // o "entravistado", na verdade, é o "pessoa2"
    val entrevistado = pessoas[1]
    entrevistado.nome = "Jojo Todinho"

    JOptionPane.showMessageDialog(null, pessoa2.nome)
    // o nome do "pessoa2" mudou!


}