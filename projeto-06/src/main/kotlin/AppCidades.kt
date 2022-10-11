import javax.swing.JOptionPane

fun main() {
    // aqui nós criamos o objeto usando um CONSTRUTOR
    val cidade1 = Cidade("São Paulo", 11_000_000)
    JOptionPane.showMessageDialog(null, cidade1.nome)
    JOptionPane.showMessageDialog(null, cidade1.populacao)

    // cidade1.nome = "São Pedro" // não funciona pois nome é val
    cidade1.populacao = 8_000_000
}