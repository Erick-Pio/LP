import org.apache.commons.dbcp2.BasicDataSource
import org.springframework.jdbc.core.BeanPropertyRowMapper
import org.springframework.jdbc.core.JdbcTemplate


fun main() {
    val dataSource = BasicDataSource()

    dataSource.driverClassName = "org.h2.Driver"
    dataSource.url = "jdbc:h2:/home/jyoshiriro/Documents/bandtec/lp/2022-2/projetos/projeto-jdbc-01/banco-aula"
    dataSource.username = "sa"
    dataSource.password = ""

    val jdbcTemplate = JdbcTemplate(dataSource)

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