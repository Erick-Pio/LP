import kotlin.math.pow

fun main() {
    println("É nóis no kotlin")
    println("Bom dia galera")

    var bairro = "Saúde"
    val cpf = "111222-99"

    println("Meu bairro é $bairro")
    println("Meu bairro é ${bairro}")
    println("Meu bairro é ${bairro.toUpperCase()}")

    bairro = "Bela Vista"
    println("Meu bairro é $bairro")

    // cpf = "999-22"
    println("Meu cpf é $cpf")

    val soma = 5 + 4
    val multi = 3 * 3
    val divisao = 90 / 2
    val subtracao = 8 - 3
    val potencia = Math.pow(2.0, 3.0)
    val potencia2 = 2.0.pow(3)
    println(soma)
    println(multi)
    println(divisao)
    println(subtracao)
    println(potencia)
    println(potencia2)

    val idade = 3

    if (idade != 3) {
        println("Maior de idade")
    } else {
        println("De menor")
    }


    var contador = 0

    while (contador < 5) {
        println(contador)
        contador++
    }


    /*
    for (var c = 0; c < 10; c++) {
        println(c)
    }
   */


    var salario = 100

    when (salario) {
        200 -> println("muito pobre")
        1000 -> println("pobre")
        in 2000..5000 -> println("classe média")
        in 20000..Int.MAX_VALUE -> {
            println("#ostentação")
            println("to bem na foto!")
        }
        else -> println("salário inválido")
    }

    for(n in 0..11){
        println(n)
    }

    val altura = 1.9

    val resultado = if (altura >= 1.8) "alto" else "baixo"

    println(resultado)

    val nota = 8.5
    val situacao = when (nota) {
        in 0.0..5.99 -> "Reprovado(a)"
        in 6.00..7.50 -> "Estágio s/ escolha"
        in 7.51..10.00 -> "Estágio você escolhe empresa"
        else -> "nota inválida!"
    }
    println(situacao)
}

