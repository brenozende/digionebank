package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista

fun main() {
    val joao = Analista("Joao", "123456789-00", 2000.00)

    ImprimeRelatorioFuncionario.imprime(joao)
}