package poo

class Heroi {

    // Aqui criamos 4 ATRIBUTOS de INSTÂNCIA
/*
lateinit -> indica que não há um valor padrão
OU seja, devemos dar um valor ao atributo antes de usá-lo.

Sem o lateinit, umas das alternativas é dar um valor padrão
Assim, toda nova instância vai 'nascer' com esse valor
 */
    lateinit var nome:String
    lateinit var poder:String
    lateinit var fraqueza:String
    var vida:Double = 100.0
    var aposentado:Boolean = false
/*
Quando temos uma função DENTRO de uma classe
podemos chamar ela de MÉTODO
 */
    fun apanharFraco() {
        vida -= 5.0
        if (vida < 0.0) {
            vida = 0.0
        }
    }

    fun apanharForte() {
        vida -= 9.0
        if (vida < 0.0) {
            vida = 0.0
        }
    }

    fun concentrar() {
        vida += 2.5
        if (vida > 100.0) {
            vida = 100.0
        }
    }
}