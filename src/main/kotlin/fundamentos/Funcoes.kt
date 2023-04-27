package fundamentos

fun main(): Unit {
    println("Hello World!");

    dizOi(retornaNome())

}

fun retornaNome(): String {
    return "Vinicius Almeida";
}

fun dizOi(nome: String, idade: Int = 21) {
    println("Oi, ${nome}! Parabens pelos seus ${idade} anos!");
}