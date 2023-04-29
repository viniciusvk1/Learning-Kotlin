package DIO

fun main() {

    val cakes = listOf("carrot","cheese","chocolate") // Criando uma lista cakes e recebendo os valores

    for (cake in cakes){ // for percorrendo a lista cakes e armazenando o objeto atual na lista na variavel cake
        println("Yummy, it's a $cake cake!") // printa na tela a frase e no lugar da $cake faz uma concatenacao mostrando o obj atual
    }

}