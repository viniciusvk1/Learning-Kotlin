package Cod3rs.fundamentos.controles

fun main() {

    val alunos = arrayListOf<String>("Andre", "Vinicus", "Cleber")

    for ((indice, aluno) in alunos.withIndex()) {
        println("$indice - $aluno")
    }
}