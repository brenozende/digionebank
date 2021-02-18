package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Breno"

    var cpf: String = "123.123.123-12"
    private set     //deixando apenas a função set da var cpf como private

    constructor()

    fun pessoaInfo() = "$nome e $cpf"
}

fun main(){
    val breno = Pessoa()

    println(breno.pessoaInfo())

}