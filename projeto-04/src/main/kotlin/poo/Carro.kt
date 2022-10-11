package poo

class Carro {
    lateinit var modelo:String
    var potencia:Double = 0.0
    var km:Int = 0
    var marcha:Int = 0
    var ligado:Boolean = false

    fun ligar() {
        ligado = true
    }

    fun desligar() {
        ligado = false
    }

    fun aumentarMarcha() {
        marcha += 1
        // marcha++
        if (marcha > 6) {
            marcha = 6
        }
    }

    fun aumentarMarchaVersao2() {
        if (marcha < 6) {
            marcha++
        }
    }

    fun reduzirMarcha() {
        marcha -= 1
        // marcha--
        if (marcha < -1) {
            marcha = -1
        }
    }

    fun reduzirMarchaVersao2() {
        if (marcha > -1) {
            marcha--
        }
    }
}