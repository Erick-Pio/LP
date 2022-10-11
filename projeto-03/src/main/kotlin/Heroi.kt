// tipagens e funções com parâmetros
fun main() {

    // aqui usamos a TIPAGEM DINÂMICA
    var nome = "Bruce Lee"
    val idade = 35
    val peso = 75.0
    val vivo = false

    // a linha abaixo NÃO compila, pois não podemos mudar o tipo
    // nome = 9.9

    // aqui usamos a TIPAGEM ESTÁTICA
    val cidadeNatal:String
    val paisOrigem:String = "EUA"
    val filhos:Int = 1
    val altura:Double = 1.75
    val lutador:Boolean = true

    treinar(4)
    lutar("Esqueleto", 6)
}

// função 'treinar' que contém 1 parâmetro ('horas') do tipo Int
fun treinar(horas:Int) {
    println("Herói treinou por $horas horas")
}

// função "lutar" que recebe os parâmetros
// oponente (texto)
// rounds (inteiro)
// ela exibe a frase "Herói lutou contra X por Y rounds"
// invoque essa função na main

fun lutar(oponente:String, rounds:Int) {
    println("Herói lutou contra $oponente por $rounds rounds")
}

/*
Crie uma função 'meditar', que recebe como parâmetros...
tempo em horas (inteiro)
nivel de concentração (real)
ambiente escuro (verdadeiro/falso)
Ao ser invocada, ela exibirá uma frase como esta:
"Após a meditação de X horas, o herói ficou Y% mais forte"
Onde Y é calculado assim:
1.5 para cada hora meditada (ex: horas = 5, adiciona 1.5 x 5)
+ 2x o nivel de concentração (ex: nivel = 9, adiciona 2x9 = 18)
se o ambiente for escuro, aumenta mais 15

Validações: 1ª parâmetro - entre 1 e 12
            2ª parâmetro - entre 0 e 3.5
Em caso de falha de alguma validação, msg de erro e pare a função
 */

fun meditar(horas: Int, concentracao:Double, ambienteEscuro: Boolean) {
    if (horas < 0 || horas > 12) {
        println("Horas inválidas")
        return
    }

    if (concentracao < 0 || concentracao > 3.5) {
        println("Concentração inválida")
        return
    }

    var y = (horas * 1.5) + (concentracao * 2)

    // if (ambienteEscuro == true) { pode ser simplificado para...
    if (ambienteEscuro) {
        // y = y + 15 pode ser simplificado para...
        y += 15
    }

    println(
    "Após a meditação de $horas horas, o herói ficou $y% mais forte"
    )
}

fun meditar2(horas: Int, concentracao:Double, ambienteEscuro: Boolean) {
    if (horas < 0 || horas > 12) {
        println("Horas inválidas")
        return
    }

    if (concentracao < 0 || concentracao > 3.5) {
        println("Concentração inválida")
        return
    }

    val y = (horas * 1.5) + (concentracao * 2) + if (ambienteEscuro) 15 else 0

    println(
    "Após a meditação de $horas horas, o herói ficou $y% mais forte"
    )
}
