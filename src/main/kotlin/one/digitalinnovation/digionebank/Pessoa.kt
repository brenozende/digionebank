package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Breno"

    var cpf: String = "123.123.123-12"
    private set     //deixando apenas a propriedade set da var cpf como private


}

fun main(){
    val breno = Pessoa()

    println(breno.nome)
    println(breno.cpf)

}