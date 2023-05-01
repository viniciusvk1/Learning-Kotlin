package Cod3rs.Classes

class Cliente2 {
    constructor(nome: String) {
        this.nome = nome
    }

    var nome: String
        get() = "Meu nome e ${field}"
        set(value) {
            field = value.takeIf { value.isNotEmpty() } ?: "Anonimo"
        }
}

fun main() {
    val c1 = Cliente2("Vinicius")
    println(c1.nome)
}