import org.apache.commons.dbcp2.BasicDataSource
import org.springframework.jdbc.core.JdbcTemplate

fun main() {
    // Estabelecendo a conexão
    val dataSource = BasicDataSource()

    /*
Os valores de 'driverClassName' e 'url' são fornecidos
pelas documentações dos drivers
     */
    dataSource.driverClassName = "org.h2.Driver"
//    dataSource.url = "jdbc:h2:mem:sptech"
    dataSource.url = "jdbc:h2:/home/jyoshiriro/Documents/bandtec/lp/2022-2/projetos/projeto-jdbc-01/banco-aula"
    dataSource.username = "sa"
    dataSource.password = ""
    // Estabelecendo a conexão

/*
JdbcTemplate -> Classe que permite realizar operações junto ao banco
 */
    val jdbcTemplate = JdbcTemplate(dataSource)

/*
método execute() -> executa qualquer tipo de instrução SQL
OBS: O ";" ao final da instrução é opcional, porém, se houverem
     mais de 1 instrução SQL, deve ter o ";" ao final de cada uma
 */
    jdbcTemplate.execute("""
        create table musica (
            id int primary key,
            nome varchar(20) not null
        )        
    """)

}