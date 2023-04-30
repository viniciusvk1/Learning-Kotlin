package Cod3rs.fundamentos

fun main() {
    var a: Int? = null
    println(a?.inc())
    // aceitando o risco e ignorando o erro da propria linguagem
    println("Momento do erro...")
    println(a!!.inc())
    // error
}