package aula2308

class Relogio {
    lateinit var modelo:String
    var preco:Double = 0.0
    var horas:Int = 0
    var minutos:Int = 0
    var segundos:Int = 0

    fun zerar() {
        horas = 0
        minutos = 0
        segundos = 0
    }

    fun validar():String {
        var valido = true
        if (horas < 0 || horas > 23) {
            horas = 0
            valido = false
        }
        if (minutos < 0 || minutos > 59) {
            minutos = 0
            valido = false
        }
        if (segundos < 0 || segundos > 59) {
            segundos = 0
            valido = false
        }
        var resultado = if (valido)
                        "Todos os valores estavam corretos!"
                        else
                        "Valores inválidos identificados. Ajustado!"
        return resultado
    }

    fun verHora():String {
        validar()
        val horasTela = horas.toString().padStart(2, '0')
        val minutosTela = minutos.toString().padStart(2, '0')
        val segundosTela = segundos.toString().padStart(2, '0')
        return "$horasTela:$minutosTela:$segundosTela"
    }

    fun verHoraV2():String {
        validar()
        return "${horas.toString().padStart(2, '0')}:${minutos.toString().padStart(2, '0')}:${segundos.toString().padStart(2, '0')}"
    }

}

