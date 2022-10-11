package aula2308.segundaparte

class PedidoPizza {
    lateinit var sabor:String
    var preco:Double = 0.0
    var quantidadeAmigos:Int = 0

    // criando um lista de String vazia que permite
    // entrada/saída/atualização de itens
    val cuponsUsados = mutableListOf<String>()

    fun descrever():String {
        return "Pedido de pizza de $sabor, que custa R$$preco"
    }

    fun validarCupom(cupom:String) {
        // adicionando o cupom na lista de cupons utilizados
        cuponsUsados.add(cupom)

        if (cupom == "#amopizza") {
            preco *= 0.9
            // preco = preco * 0.9
        }
    }

    fun obterValorPorAmigo():Double {
        return preco / quantidadeAmigos
    }

    fun obterCuponsUsados():String {
        // \r\n é quebra de linha
        var frase = "Cupons usados:\r\n"

        // iterando na lista
        cuponsUsados.forEach {
            frase += "- $it \r\n"
        }
        return frase
    }
}