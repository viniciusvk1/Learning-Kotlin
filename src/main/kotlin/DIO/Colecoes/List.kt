package DIO.Colecoes

// Criando uma variavel imutavel systemUsers -> recebendo uma lista mutavel
val systemUsers: MutableList<Int> = mutableListOf(1, 2, 3) // A variavel so pode receber a instancia da lista inicial
val sudoers: List<Int> = systemUsers // Criando uma variavel imutavel recebendo a variavel systemUsers
// em resumo criando uma copia de somente leitura da lista mutableListOf

fun addSystemUsers(newUser: Int) {
    systemUsers.add(newUser)    // Adiciona um novo usuario na lista "mutableListOf" -> aceita ser manipulado
}

fun getSysSudoers(): List<Int> {
    return sudoers // retorna a copia de leitura da lista anterior
}

fun main() {
    addSystemUsers(4) // adiciona um novo dado a lista que pode ser mutavel
    println("Tot sudoers: ${getSysSudoers().size}") // mostra a copia da lista mostrando o tamanho de dados que estao presentes na lista original
    getSysSudoers().forEach{ // percorre todos os elementos da lista
            i -> println("Soma useful into on user $i")
    }

    //   getSysSudoers().add(5) <- Error! (Impossivel adicionar dados em uma lista imutavel (somente leitura)

}