package fundamentos

fun main() {

    // parOuImpar(2);
    // parOuImpar(3);

//    resultadoNota(3)
//    resultadoNota(5)
//    resultadoNota(10)

    println(parOuImpar(9))
    println(parOuImpar(2))

}

fun parOuImpar(numero: Int): String {
    return if (numero % 2 == 0) {
        "Par"
    } else {
        "Impar"
    }
}

//Se a nota for maior do que 6 = Passou
//Se a nota for menor que 6 = recuperacao
//Se a nota for menor que 4 = reprovado

fun resultadoNota(nota: Int) {
    if (nota >= 6) {
        println("Aprovado")
    } else if (nota >= 4) {
        println("Recuperacao")
    } else {
        println("Reprovado")
    }
}