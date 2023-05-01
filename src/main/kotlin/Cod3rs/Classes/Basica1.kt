package Cod3rs.Classes

class Cliente { // Classe cliente com uma variavel dentro recebendo o valor de String
    var nome: String = "" // Esta sendo iniciada como vazio porem podera receber novos valores por ser uma var e nao val
}

fun main() {
    val cliente = Cliente()  // Criando um objeto do tipo Cliente
    cliente.nome = "Vinicius" // chamando a variavel nome herdada da classe cliente para acessar a mudanca de valor
    println("O cliente e: ${cliente.nome}")
}