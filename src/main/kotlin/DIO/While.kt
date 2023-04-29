package DIO

fun main() {
    var cakesEaten = 0 // Valor inicial que ira ser incrementado a cada loop no while
    var cakesBaked = 0 // valor inicial que ira ser incrementado a cada loop no do

    while (cakesEaten < 5) { // enquanto for menor que 5 continua dentro do while
        eatACake() // chama a funcao para retornar o println
        cakesEaten++ // Adiciona 1 em bolos comidos
    }

    // Quando o loop while chegar em 5 bolos comidos, sera necessario fazer mais
    // com isso entramos no segundo loop do codigo
    // onde ele ira assar os bolos dependendo da quantidade de bolos comidos
    // se for comido 5 bolos como no codigo
    // serao assados mais 5 bolos

    do {
        bakedACake() // chama a funcao para retornar o println
        cakesBaked++ // adiciona +1 em bolos feitos
    } while (cakesBaked < cakesEaten)

}

//funcoes utilizadas
fun eatACake() = println("Eat a Cake")
fun bakedACake() = println("Bake a Cake")