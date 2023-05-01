package Cod3rs.Classes

class Pessoa1(var nome: String) // criando um construtor recebendo apenas o nome e esse nome podendo ser modificado por se tratar de var
class Pessoa2(val nome: String) // criando um construtor recebendo apenas o nome porem nao podendo ser modificado apos receber o valor por ser val

class Pessoa3(nomeInicial: String) {  // criando um construtor com uma variavel que so e possivel acessar a variavel no momento em que o objeto e construido
    val nome: String = nomeInicial
}

fun main() {
    val p1 = Pessoa1("Vinicius") // Criando o primeiro objeto do tipo Pessoa1 -> recebe nome de Vinicius
    println("${p1.nome} sabe programar!") // -> concatenado a frase e mostrando que foi aceito a atribuicao de variavels
    p1.nome = "Vinicius Almeida" // modificando o valor da variavel por se tradar de uma variavel mutavel (var)
    println("${p1.nome} sabe programar!") // -> concatenando e mostrando a modificacao

    val p2 = Pessoa2(nome = "Camile") // criando um objeto do tipo Pessoa2 onde a variavel recebe o valor de Camile
 //   p2.nome = "Camile Righetti" -> Tentativa de atribuir um novo valor porem sendo barrado por motivo de ser uma constante e nao permitir modificacoes

    val p3 = Pessoa3(nomeInicial = "Fernanda")
 //   p3.nome = "Teste" -> modificacao nao permitida por ser uma variavel acessavel somente no momento em que e criado

    println("${p2.nome} e ${p3.nome} sao legais!")
}
