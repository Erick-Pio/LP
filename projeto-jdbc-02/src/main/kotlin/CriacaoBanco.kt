fun main() {

    val jdbcTemplate = Conexao().getJdbcTemplate()

/*
método execute() -> executa qualquer tipo de instrução SQL
OBS: O ";" ao final da instrução é opcional, porém, se houverem
     mais de 1 instrução SQL, deve ter o ";" ao final de cada uma
 */
    jdbcTemplate.execute("""
        create table IF NOT EXISTS musica (
            id int primary key,
            nome varchar(20) not null
        );
                
        create table IF NOT EXISTS pokemon (
            id int primary key,
            nome varchar(20) not null,
            forca decimal(7,2),
            solto boolean
        );
    """)

}