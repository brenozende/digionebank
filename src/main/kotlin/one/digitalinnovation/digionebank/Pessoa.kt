package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Breno"
    var cpf: String = "123.123.123-12"
}

fun main(){
    val breno = Pessoa()

    println(breno.nome)
    println(breno.cpf)
}