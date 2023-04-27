package fundamentos

class Carro(var cor: String, anoFabricacao: Int, val dono: Dono) {
}

data class Dono(var nome: String, var idade: Int){
}

fun main(){
    var carro = Carro("Branco", 2023, Dono("Vinicius", 21));

    println(carro.cor);
    carro.cor= "Preto";

    println(carro.cor);

    println(carro.dono.idade);
    println(carro.dono.nome);

}