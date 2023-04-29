package DIO

import kotlin.contracts.ReturnsNotNull

fun main() {

//    var nevelNull: String
//    nevelNull = null          A varivel neverNull sendo do tipo String, a linguagem entende
//    println(nevelNull)        que nao pode ser relacionado com um valor null
    var nevelNull: String
    nevelNull = "Hello"         // Atribuindo um valor em uma variavel do tipo string
    println(nevelNull)          // A linguagem aceita receber um valor do tipo String e nao null


    var nullable: String?       // Indicando para a linguagem que o valor pode ser null
    nullable = null             // nao ocorre erros por conta do simbolo ? apos o tipo da variavel
    println(nullable)           // A leitura pode ser = Aceite um valor do tipo String ou null


//    var inferredNonNull = "Hello again!"    Atribuindo um valor diretamente a uma variavel para a propria linguagem entender o o tipo
//    inferredNonNull = null                  Atribuindo novamente um valor null -> a linguagem nao aceita pois foi designado implicitamente
//    println(inferredNonNull)            que a variavel apenas aceita entradas do tipo String e nao valores null

// Para utilizar a variavel inferredNonNull com o tipo nullo devemos passar o ? logo apos definir o tipo da variavel

    var inferredNonNull: String? = "Hello again!"
    inferredNonNull = null                          // Assim o valor null pode ser mostrado
    println(inferredNonNull)


    fun strLenght(notNull: String): Int {
        return notNull.length
    }

    strLenght(nevelNull)
//    strLenght(nullable)   a funcao nao aceita um valor null

    println(strLenght(nevelNull)) // mostra a quantidade de caracteres salvos na variavel neverNull (Hello)



}