package poo

fun main() {
    val heroi1 = Heroi()
    heroi1.nome = "Super Homem"
    heroi1.poder = "Voar e Super força"
    heroi1.fraqueza = "Criptonita"

    val heroi2 = Heroi()
    heroi2.nome = "Homem Formiga"
    heroi2.poder = "Ficar pequenino e gigante"
    heroi2.fraqueza = "Inseticida"

    println("Nome do 1º herói: ${heroi1.nome}")
    println("Nome do 2º herói: ${heroi2.nome}")

    heroi2.fraqueza = "Apanhar da vespa"
    println("Fraqueza do 2º herói: ${heroi2.fraqueza}")

    println("Vida do 1º herói: ${heroi1.vida}")


    val heroi3 = Heroi()
    heroi3.nome = "Capitão América"
    // println(heroi3.poder)

    heroi1.apanharFraco()
    println("Vida do 1º herói: ${heroi1.vida}")

    heroi1.apanharFraco()
    heroi1.apanharFraco()
    heroi1.apanharFraco()
    heroi1.apanharFraco()
    println("Vida do 1º herói: ${heroi1.vida}")

    println("Vida do 3º herói: ${heroi3.vida}")
    heroi3.apanharFraco()
    heroi3.apanharFraco()
    println("Vida do 3º herói: ${heroi3.vida}")
}