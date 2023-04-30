package DIO

fun main() {

    for (i in 0..3) {  // contador i percorrendo o parametro de 0 a 3 (incluindo 3)
        println(i)          // printando a posicao do i
    }

    for (i in 0 until 3) {      // contador i de 0 ate 2 (menores que 3 e maiores que 0)
        println(i)                  // printando a posicao do i
    }

    for (i in 2..8 step 2) {        // contador i de 2 ate 8 pulando intervalos de 2 em 2
        println(i)                      // printando a posicao do i
    }

    for (i in 3 downTo 0) {      // contador i contando de 3 ate 0
        println(i)                  // printando a posicao do i
    }

}