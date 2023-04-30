package Cod3rs.fundamentos.controles

fun main() {
    var op: Int = 0

    while (op != -1) {
        val line = readln() ?: "0"
        op = line.toIntOrNull() ?: 0

        println("Voce escolheu a opcao $op")
    }
    println("Ate a proxima!")
}