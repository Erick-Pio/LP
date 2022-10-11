package repositorio

import dominio.Pais
import org.springframework.jdbc.core.BeanPropertyRowMapper
import org.springframework.jdbc.core.JdbcTemplate

class PaisRepositorio(val jdbcTemplate: JdbcTemplate) {

    fun inserir(pais: Pais) {
        jdbcTemplate.update("""
            insert into pais (nome, populacao) values
            ('${pais.nome}', ${pais.populacao})
        """)
        /*
        jdbcTemplate.update("""
            insert into pais (nome, populacao) values
            (?, ?)
        """, pais.nome, pais.populacao)
         */
    }

    fun excluirTodos() {
        jdbcTemplate.update("delete from pais")
    }

    fun listar():List<Pais> {
        return jdbcTemplate.query("select * from pais",
                                BeanPropertyRowMapper(Pais::class.java))
    }

    fun recuperar(id:Int):Pais {
        // "?" será substituido pelo "id" do 3º argumento
        // queryForObject() recupera só 1 linha do banco
        val pais = jdbcTemplate.queryForObject(
            "select * from pais where id = ?",
            BeanPropertyRowMapper(Pais::class.java),
            id
        )
        return pais
    }

    fun excluir(id:Int):Int {
        // "?" será substituido pelo "id" do 2º argumento
        val excluidos = jdbcTemplate.update("delete from pais where id = ?", id)
        //val excluidos = jdbcTemplate.update("delete from pais where id = $id")
        return excluidos
    }

}