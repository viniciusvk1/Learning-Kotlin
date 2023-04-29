package DIO

fun main() {
    println(describeString("Hello")) // Retorna o bloco if -> quantidade de caracteres
    println(describeString(null)) // Retorna o bloco else -> Nenhum dado ou null
    println(describeString("")) // Retorna novamente o bloco else -> Pelo motivo de ser uma string vazia
}

fun describeString(maybeString: String?): String {
    if (maybeString != null && maybeString.length > 0) {
        return "String of length ${maybeString.length}"
    } else {
        return "Empty or null string"
    }
}