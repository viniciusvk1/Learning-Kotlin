package Cod3rs.fundamentos

fun main() {
    // Tipos numericos inteiros

    val num1: Byte = 127
    val num2: Short = 32767
    val num3: Int = 2147483647
    val num4: Long = 4901249072190479210

    val num5: Float = 3.14F
    val num6: Double = 3.14

    val char: Char = '?'

    val boolean: Boolean = true // or false

    println(listOf(num1, num2, num3, num4, num5, num6, char, boolean))
    println(2 is Int)
    println(2147486381 is Long)
    println(1.0 is Double)

    println(10.dec())
    
}