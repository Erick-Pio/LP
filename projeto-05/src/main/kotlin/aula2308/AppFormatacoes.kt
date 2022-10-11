package aula2308

fun main() {
    val n1 = 9
    val n2 = 15

    println("$n1-$n2")

    val x1 = "9".padStart(2, '0') // "09"
    val x2 = "15".padStart(2, '0') // "15"
    println("$x1-$x2") // 09-15

    val z1 = "9"
    val z2 = "15"
    println("${z1.padStart(2,'0')}-${z2.padStart(2,'0')}")
    // 09-15
}