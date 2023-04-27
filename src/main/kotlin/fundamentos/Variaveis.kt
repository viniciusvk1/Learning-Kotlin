package fundamentos

fun main() {
    var nome = "Gustavo";
    val nomeVal = "Gustavo";

    nome = "Daniel"
    //nomeVal = "Vinicius"

    var idade = 21;
    println(idade);

    val teste: String;
    teste = "Teste";

}

class variaveis {
    lateinit var teste: String;

    fun iniciaVariavel() {
        teste = "Teste"
    }
}
