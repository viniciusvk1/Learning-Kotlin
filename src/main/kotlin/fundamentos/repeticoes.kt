package fundamentos

fun main() {

//    printando1a10()
//   printando10a1()
//    printaPar1a10()

//    printaRange(1, 5)
//    whileMenorQue10()

    doWhileMenor10()

}

fun doWhileMenor10() {
    var x = 10
    do {
        println(x)
        x++
    } while (x < 10)
}

fun whileMenorQue10() {
    var x = 0
    while (x < 10) {
        println(x)
        x++
    }
}


fun printando1a10() {
    for (numero in 1..10) {
        println(numero)
    }
}

fun printando10a1() {
    for (numero in 10 downTo 1) {
        println(numero)
    }
}

fun printaPar1a10() {
    for (numero in 2..10 step 2) {
        println(numero)
    }
}

fun printaRange(inicio: Int, final: Int) {
    for (numero in inicio..final) {
        println(numero)
    }
}