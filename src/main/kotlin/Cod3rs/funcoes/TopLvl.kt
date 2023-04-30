package Cod3rs.funcoes

fun min(a: Int, b: Int): Int {
    return if (a < b) a else b
}

fun main() {
    println("O menor valor e: ${min(3,4)}")
}