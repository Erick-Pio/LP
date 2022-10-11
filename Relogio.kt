class Relogio(
    var horas:Int = 0,
    var minutos:Int = 0,
    var segundos:Int = 0
)
{
    fun horaAtual():String {
        val horasTela = horas.toString().padStart(2,'0')
        val minutosTela = minutos.toString().padStart(2,'0')
        val segundosTela = segundos.toString().padStart(2,'0')

        return "Agora são: ${horasTela}:${minutosTela}:${segundosTela}"
    }

    fun adicionarTempo(maisHoras:Int, maisMinutos:Int, maisSegundos:Int) {
        if (maisHoras <= 24) {
            val soma = horas + maisHoras
            if (soma > 23) {
                horas = soma - 24
            } else {
                horas = soma
            }
        }
        if (maisMinutos <= 59) {
            val soma = minutos + maisMinutos
            if (soma > 59) {
                minutos = soma - 60
            } else {
                minutos = soma
            }
        }
        if (maisSegundos <= 59) {
            val soma = segundos + maisSegundos
            if (soma > 59) {
                segundos = soma - 60
            } else {
                segundos = soma
            }
        }
    }
}