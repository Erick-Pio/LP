
fun main() {
    val meuSalario = 10000.0
    val meuInss = inss(meuSalario)
    println("Meu INSS será de $meuInss")

    println("INSS qualquer: ${inss(50000.0)}")


    val meuIR = impostoRenda(meuSalario)
    println("Meu IR: $meuIR")
    println("Meu IR: ${impostoRenda(50000.0)}")


    val possoAposentar = podeAposentar(90)
    println("Posso aposentar? $possoAposentar")
    println("Posso aposentar? ${podeAposentar(25)}")
}

/*
Esta função tem 1 parâmetro e TEM RETORNO do tipo Double
Ou seja, podemos invocá-la dando valor a uma variável
ou numa expressão
 */
fun inss(salario:Double):Double {
    return salario * 0.1
}

/*
Crie a função 'impostoRenda', que recebe 'salario' (real)
Ela retorna um real, que pode ser...
15% do salário, caso o salário for até 2500
20% do salário, caso o salário for maior que 2500
 */
fun impostoRenda(salario:Double):Double {
    if (salario <= 2500) {
        return salario * 0.15
    } else {
        return salario * 0.2
    }
}

fun impostoRenda2(salario:Double):Double {
    return salario * if (salario <= 2500) 0.15 else 0.20
}

/*
Crie uma função 'podeAposentar', que recebe uma 'idade' (inteiro)
Ela retorna verdadeiro se a idade for a partir de 65
ou falso, caso contrário
 */
fun podeAposentar(idade:Int):Boolean {
    if (idade >= 65) {
        return true
    } else {
        return false
    }
}

fun podeAposentar2(idade:Int):Boolean {
    return (idade >= 65)
    // return idade >= 65
}
