import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main() {
    /*
    LocalDate -> Classe para data
    LocalDate.now() -> retorna a data atual do SO
     */
    val hoje = LocalDate.now()
    println(hoje)

    // criando uma data a partir de um texto
    // usamos o método parse()
    val dataQualquer = "2000-12-31" // ou solicitando do usuário
    val data1 = LocalDate.parse(dataQualquer)

    // para usar outro formato de data, usamos a classe
    // DateTimeFormatter
    val formato = DateTimeFormatter.ofPattern("dd/MM/yyyy")
    val data2 = LocalDate.parse("31/12/2000", formato)
    println(data2) // na tela vai continuar mostrando ano-mes-dia!

    /*
       LocalDateTime -> Classe para data e hora
       LocalDateTime.now() -> retorna a data e hora atual do SO
    */
    val agora = LocalDateTime.now()
    println(agora)

    val dataHoraQualquer = "2000-12-31T21:30:00"
    val dataHora1 = LocalDateTime.parse(dataHoraQualquer)

    val formatoDH = DateTimeFormatter
                        .ofPattern("dd/MM/yyyy HH:mm:ss")
    val dataHora2 = LocalDateTime
                        .parse("31/12/2000 15:30:00", formatoDH)
    println(dataHora2) // na tela vai continuar mostrando no formato ISO

    
    // exibindo data e data-hora em formatos "amigáveis"
    // usamos o método .format() passando um DateTimeFormatter
    val hojeBonito = hoje.format(formato)
    val agoraBonito = agora.format(formatoDH)
    println(hojeBonito)
    println(agoraBonito)

    // operações com data
    val ontem = hoje.minusDays(1) // OBS: o "hoje" não se alterou!
    println(ontem)

    val amanha = hoje.plusDays(1) // OBS: o "hoje" não se alterou!
    println(amanha)

    val daquiAlgumasHoras = agora.plusHours(5) // +5 horas
    println(daquiAlgumasHoras)
    // OBS: o "agora" não se alterou!
    
}