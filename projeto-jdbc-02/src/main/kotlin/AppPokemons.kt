import org.springframework.jdbc.core.BeanPropertyRowMapper
import javax.swing.JOptionPane.showInputDialog
import javax.swing.JOptionPane.showMessageDialog

fun main() {
    val jdbcTemplate = Conexao().getJdbcTemplate()

    jdbcTemplate.update("delete from pokemon")

    // for (id in 1..3) {
    for (id in 1..3) {
        val novoNome = showInputDialog("Qual o nome?")
        val novaForca = showInputDialog("Qual a força?").toDouble()
        val novoSolto = showInputDialog("Digite 1 se estiver solto") == "1"

        val novoPokemon = Pokemon(novoNome, novaForca, novoSolto)

        val sqlInsert = """
            insert into pokemon (id, nome, forca, solto) values 
            ($id, '${novoPokemon.nome}', 
             ${novoPokemon.forca}, ${novoPokemon.solto})
        """.trimIndent()

        println("sql de insert: $sqlInsert")

        jdbcTemplate.update(sqlInsert)
    }

    val listaPokemons:List<Pokemon> = jdbcTemplate.query(
        "select * from pokemon",
        BeanPropertyRowMapper(Pokemon::class.java)
    )

    var resultado = "Pokemons no banco: \r\n"
    listaPokemons.forEach {
        resultado += "Pokemon de nome ${it.nome}, força ${it.forca}"
        resultado += " - Solto? ${if (it.solto) "Sim" else "Não"}"
        resultado += "\r\n"
    }

    showMessageDialog(null, resultado)
}