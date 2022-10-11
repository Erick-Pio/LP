/*
Uma "data class" é uma classe com objetivo principal de
trafegar dados na aplicação.
Ela não deveria ter métodos com regras nela

Este tipo de classe é muito comum para "refletir" uma tabela
Para o caso de refletir uma tabela, faça sempre:
    - crie um "constructor()", como feito aqui, com quaisquer valores padrão
    - torne os atributos "var"
 */
data class Pokemon(var nome:String, var forca:Double, var solto:Boolean) {
    constructor() : this("", 0.0, false)
}