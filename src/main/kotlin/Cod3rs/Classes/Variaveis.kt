package Cod3rs.Classes

val diretamenteNoArquivo = "Bom dia"

fun topLevel() {
    val local = "Fulano"
    println("${diretamenteNoArquivo} $local")
}

class Coisa {
    val variavelDeInstancia: String = "Boa noite"

    companion object {
        @JvmStatic
        val constanteDeClasse = "Cliente"
    }

    fun fazer() {
        val local: Int = 7

        if (local > 3) {
            val variavelDeBloco = "Beltrano"
            println("${variavelDeInstancia}, $constanteDeClasse, $local e $variavelDeBloco")
        }
    }

}


fun main() {
    topLevel()
    Coisa().fazer()
    println(Coisa.constanteDeClasse)
}