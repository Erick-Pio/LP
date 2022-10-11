import org.springframework.jdbc.core.BeanPropertyRowMapper


fun main() {
    val jdbcTemplate = Conexao().getJdbcTemplate()

    /*
    Método queryForList() -> Usamos para realizar consultas (select)
    Seu retorno é uma lista
     */
    val musicas = jdbcTemplate.queryForList("select * from musica")

    println(musicas)


    val listaMusicas:List<Musica> = jdbcTemplate.query(
        "select * from musica",
        BeanPropertyRowMapper(Musica::class.java)
    )
    listaMusicas.forEach {
        println("Música ${it.id} - ${it.nome}")
    }
}