package repositorio

import dominio.Carro
import org.springframework.jdbc.core.BeanPropertyRowMapper
import org.springframework.jdbc.core.JdbcTemplate

class CarroRepositorio(val jdbcTemplate: JdbcTemplate)  {

    fun inserir(carro: Carro) {
        jdbcTemplate.update("""
            insert into carro (modelo, ano, potencia) values
            (?, ?, ?)
        """, carro.modelo, carro.ano, carro.potencia)
    }

    fun listar():List<Carro> {
        return jdbcTemplate.query("select * from carro",
                BeanPropertyRowMapper(Carro::class.java))
    }

    // verificando se um idCarro existe na tabela
    fun idCarroValido(idCarro:Int):Boolean {
        val contagem = jdbcTemplate.queryForObject(
            "select count(*) from carro where idCarro = ?",
            Int::class.java,
            idCarro
        )
        return contagem == 1
    }

    fun recuperar(id:Int):Carro {
        val carro = jdbcTemplate.queryForObject(
            "select * from carro where idCarro = ?",
            BeanPropertyRowMapper(Carro::class.java),
            id
        )
        return carro
    }

    fun listarSeminovos():List<Carro> {
        return jdbcTemplate.query(
        "select * from carro where ano >= 2019 order by potencia",
        BeanPropertyRowMapper(Carro::class.java))
    }

    fun listarSeminovosPotentes():List<Carro> {
        return jdbcTemplate.query(
        """
        select * from carro 
        where ano >= 2019 and potencia >= 1.5 
        order by ano            
        """,
        BeanPropertyRowMapper(Carro::class.java))
    }

    fun excluirPorModelo(modelo:String):Int {
        val excluidos = jdbcTemplate.update(
            "delete from carro where modelo like ?",
            "%$modelo%")
        return excluidos
    }
}