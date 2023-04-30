package Cod3rs.funcoes

fun relacaoDeTrabalho(chefe: String, funcionario: String): String{
    return "$funcionario e subordinado(a) a $chefe"
}

fun main() {
    println(relacaoDeTrabalho("Vinicius", "Pedro"))
}