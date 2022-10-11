package dominio

data class Carro(
    var idCarro: Int,
    var modelo: String,
    var ano:Int,
    var potencia:Double
) {
    constructor() : this(0,"",0,0.0)
}
