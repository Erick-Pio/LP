class Estado {

    // se um atributo tem GET ou SET ele NÃO pode ser lateinit
    var nome:String = ""
        get() = field.uppercase()
    /*
^ Isso é um GETTER, onde definimos como o valor do campo é entregue
     */
        set(value) {
            if (value.length >= 3) {
                field = value
            }
        }

    var populacao:Int = 0
        set(value) { // isso é um bloco SETTER, onde definimos regras para alteração do atributo
            if (value >= 0) {
                field = value
            }
        }
}