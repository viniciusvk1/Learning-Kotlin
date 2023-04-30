package Cod3rs.fundamentos

fun main() {
    val opcional: String? =
        null //Para o exemplo fazer sentido a variavel opcional recebe um valor null utilizando safe call operator
    // continuando a segunda variavel do tipo String obrigatorio -
    // -> recebe o valor atribuido a variavel opcional porem se o valor recebido for diferente do tipo da String
    // tera um valor padrao caso seja diferente do esperado -> no caso a mensagem "valor padrao" sera atribuida
    // a variavel obrigatorio por diferencas de tipo de conteudo
    // isso funciona por conta do operador elvis = ?:
    val obrigatorio: String = opcional ?: "Valor Padrao"
    // testando os valores que serao mostrados ao terminal
    println(obrigatorio)
}