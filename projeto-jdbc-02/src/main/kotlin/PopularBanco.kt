fun main() {
    val jdbcTemplate = Conexao().getJdbcTemplate()

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