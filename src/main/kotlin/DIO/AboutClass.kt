package DIO

class Customer // Classe de clientes

class Contact(
    val id: Int,
    var email: String
) // Classe que obrigatoriamente deve receber uma constante (val) do tipo Int

// e uma variavel do tipo String
fun main() {

    val customer = Customer() // Criando sem necessidade de passar parametros

    val contact = Contact(1, "email@email.com") // Criando com as especificaos obrigatorias


    println(contact.id) // mostra o id cadastrado
    println(contact.email) // mostra o email cadastrado

    contact.email = "email2@email.com" // Como o campo email e uma variavel podemos trocar futuramente o que o campo email recebe
//    contact.id = 2 id sendo uma constante nao podera receber valores novamente apos ser atribuido uma vez

    println(contact.email) // mostra a mudanca que foi feita na variavel
    println(contact.id) // Continua mostrando o primeiro valor que foi informado

}