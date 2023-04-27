package fundamentos

fun main() {
//
//    val x = 22;
//
//    when (x) {
//        5, -5 -> println("X == 5")
//        8 -> println("X == 8")
//        10 -> {
//            println("X == 10")
//            println("X e uma dezena!")
//        }
//
//        in 11..15 -> println("Esta entre 11 e 15")
//        !in 16..20 -> println("Nao esta entre 16 a 20")
//        else -> println("Numero nao mapeado")
//    }

    when {
        comecaComOi(5) -> println("5")
        comecaComOi("Oi, tudo bem?") -> println("Oi, tudo bem?")
    }

}

fun comecaComOi(x: Any): Boolean {
    return when (x) {
        is String -> x.startsWith("Oi")
        else -> false
    }
}