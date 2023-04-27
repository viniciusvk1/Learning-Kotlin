package fundamentos

fun main() {

    var nome: String? = null

    var tamanho: Int = nome?.length ?: 0

    println(tamanho)

//    var nome: String? = "Vinicius"
//
//    if (nome != null) {
//        println(nome.length)
//    }
//
//    val toShort: Short = nome!!.length.toShort();

}

