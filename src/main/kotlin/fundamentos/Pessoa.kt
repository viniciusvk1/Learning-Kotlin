package fundamentos

class Pessoa(var nome: String, var idade: Int) {
    override fun toString(): String {
        return "Classe: Pessoa. Nome: ${nome}, idade: ${idade}"
    }
}

fun main() {
    var pessoa1 = Pessoa("Vinicius", 21);
    println(pessoa1);
}