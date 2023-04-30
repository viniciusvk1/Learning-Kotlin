package Cod3rs.fundamentos

fun main() {
    var a: Int? =
        null // Safe call operator: ? -> indica que a variavel pode receber um valor null ou um valor do tipo atribuido

    println(a?.dec()) // mostrando o valor da variavel usando o safe call operator e o metodo de decrementar valor inserido
    // no caso, como sendo null o valor nao havera problemas em retornar um valor pelo operador ? utilizado

}