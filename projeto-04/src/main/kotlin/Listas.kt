
fun main() {
// Esta função cria uma lista SOMENTE LEITURA
    val herois = listOf("Batman", "Mulher Maravilha", "Thor")

    println(herois)

    println("Primeiro: ${herois[0]}")
    println("Último: ${herois[herois.size - 1]}")
    println("Primeiro: ${herois.first()}")
    println("Último: ${herois.last()}")

/*
Não é possível nem adicionar nem remover elementos da lista
quando criamos ela com 'listOf()'
Esta função cria uma lista SOMENTE LEITURA
 */
    // herois.add("Saitama")

// Esta função cria uma lista que pode ser alterada
// ou seja, uma lista mutável
    val paises = mutableListOf("Canadá", "Japão", "Coréia")
    // inserindo elementos numa lista mutável
    paises.add("Chile")
    paises.add("México")
    println(paises)

    // removendo elemento indicando o índice (ou posição)
    paises.removeAt(2)
    println(paises)

    // removendo elemento a partir do conteúdo
    paises.remove("Chile")
    println(paises)

    // isso dá erro em tempo de execução, pois não existe 100
    // paises.removeAt(100)

    // essa função não dá erro mesmo que o elemento não exista
    paises.remove("Nicarágua")
    // esta função retorna TRUE se excluiu ou FALSE em caso contrário

/*
 A "!" antes de um teste lógico ou se um boolean
 INVERTE seu resultado.
 É como se fosse "se NÃO remover o pais tal..."
 */
    if (!paises.remove("Iraque")) {
        println("Não excluiu Iraque porque não tinha!")
    }

    if (paises.remove("Canadá")) {
        println("Excluiu o Canadá!")

    }

// isEmpty() -> retorna TRUE se a lista possui pelo menos 1 elemento
    if (paises.isEmpty()) {
        println("A lista de países está vazia")
    } else {
        println("A lista de países contém elementos")
    }

/*
Exemplo de for para iterar em cada elemento da lista.
Dentro do for a variável 'pais' é o país de cada iteração
 */
    for (pais in paises) {
        println("Pais na lista: $pais")
        // pais = "Panamá"
        // a variável de iteração é IMUTÁVEL
        // ou seja, não ṕode ser reatribuída, é uma 'val'
    }
/*
o forEach cria um bloco de código que executa N vezes,
conforme a quantidade de elementos na lista
o "it" é o nome automático de cada elemento da lista na iteração
 */
    paises.forEach {
        println("Pais na lista: $it")
    }

/*
É possível dar um nome para o elemento da iteração,
como no exemplo abaixo, onde o chamamos de 'pais'
 */
    paises.forEach { pais ->
        println("Pais na lista: $pais")
    }

    val cidades = listOf(
        "Belo Horizonte",
        "Araraquara",
        "Brasília",
        "Curitiba",
        "Fortaleza",
        "Diadema"
    )
    println(cidades)

// sorted() -> retorna uma versão ORDENADA da lista
// ela NÃO altera a lista original
    // cidades.sorted()
    println(cidades.sorted())

    val pesos = listOf(22.0, 33.5, 11.2, 9.9, 15.2)
    println(pesos.sorted())

    val frutas = mutableListOf(
        "maçã",
        "maracuja",
        "uva",
        "abacaxi",
        "banana"
    )

// a função sort() só existe em listas MUTÁVEIS
// ela altera a disposição dos elementos, aplicando uma ordenação
    frutas.sort()
    println(frutas)
}


