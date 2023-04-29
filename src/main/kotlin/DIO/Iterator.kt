package DIO

class Animal(val name: String) // Cria um objeto Animal que necessariamente precisa ser atribuido o nome do animal

class Zoo(val animals: List<Animal>) {  // Cria um objeto Zoo com uma lista do tipo Animal
    operator fun iterator(): Iterator<Animal> { // Usando a classe Animal cria-se um iterator
        return animals.iterator()
    }
}

fun main() {
    val animals = listOf(Animal("Lion"), Animal("Dog")) // Cria dois animais atribuindo o nome de lion e dog
    val zoo = Zoo(animals) // Passa a lista de Animals para o construtor do Zoo

    for (animal in zoo) { // Mostra os objetos adicionados em zoo
        println("Watch out, it's a ${animal.name}") // A cada animal adicionado ira retornar essa mensagem
    }
}