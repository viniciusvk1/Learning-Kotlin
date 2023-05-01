package Cod3rs.Classes

class Data(var dia: Int, var mes: Int, var ano: Int) {
    fun formatar(): String {
        return "$dia/$mes/$ano"
    }
}

fun main() {
    var nascimento: Data = Data(17,11,2001)
    println(nascimento.formatar())
}