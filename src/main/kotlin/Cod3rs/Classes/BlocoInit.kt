package Cod3rs.Classes

class Filme3(nome: String, anoLancamento: Int, genero: String) {
    val nome: String
    val anoLancamento: Int
    val genero: String

    init {
        this.nome = nome
        this.anoLancamento = anoLancamento
        this.genero = genero
    }
}

fun main() {
    val filme = Filme3("Os Incriveis", 2004, "Acao")
    println("${filme.nome} foi lancado em ${filme.anoLancamento}")
}