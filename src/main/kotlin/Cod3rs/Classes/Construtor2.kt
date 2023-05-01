package Cod3rs.Classes

class Filme2(val nome: String, val anoLancamento: Int, val genero: String)

fun main() {
    val filme = Filme2("Monstros S.A", 2001, "Comedia")
    println("A ${filme.genero} ${filme.nome} foi lancado em ${filme.anoLancamento}")
}
