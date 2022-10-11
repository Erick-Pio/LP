import org.apache.commons.dbcp2.BasicDataSource
import org.springframework.jdbc.core.JdbcTemplate

fun main() {
    val dataSource = BasicDataSource()

    dataSource.driverClassName = "org.h2.Driver"
    dataSource.url = "jdbc:h2:/home/jyoshiriro/Documents/bandtec/lp/2022-2/projetos/projeto-jdbc-01/banco-aula"
    dataSource.username = "sa"
    dataSource.password = ""

    val jdbcTemplate = JdbcTemplate(dataSource)

    /*
Método update() -> Usado para executar apenas DML
               (insert, update, delete)
Seu retorno é um Int que diz quantidade de linhas afetadas
 */
    val linhasAfetadas = jdbcTemplate.update("""
        insert into musica (id, nome) values
        (1, 'aaa'), (2, 'bbb'), (3, 'ccc')
    """)
    println("$linhasAfetadas linhas inseridas")

}