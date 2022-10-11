class Produto {
    var nome:String = ""
        set(value) {
            if (value.length >= 4) {
                field = value
            }
        }
        get() = if (field == "") "N/D" else field

    var preco:Double = 0.0
        set(value) {
            if (brinde) {
                field = 0.01
            } else {
                if (value >= 0.01) {
                    field = value
                }
            }
        }

    var brinde:Boolean = false
        set(value) {
            field = value
            if (field) {
                preco = 0.01
            }
        }
}