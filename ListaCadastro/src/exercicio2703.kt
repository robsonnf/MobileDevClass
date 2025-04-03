
// Definindo uma classe Pessoa
class Pessoa(val nome: String, var idade: Int) {

    // Função para retornar uma saudação
    fun saudacao(): String {
        return "Olá, meu nome é $nome e eu tenho $idade anos."
    }

    // Função para verificar se a pessoa pode votar
    fun podeVotar(): Boolean {
        return idade >= 16
    }
}

fun main() {
    // Definindo variáveis com 'val' e 'var'
    val numeroConstante: Int = 100  // 'val' é imutável, ou seja, o valor não pode ser alterado
    var numeroVariavel: Int = 10    // 'var' é mutável, ou seja, o valor pode ser alterado

    // Tipos diferentes de variáveis
    var nome: String = "João"        // Tipo String
    var idade: Int = 20             // Tipo Int
    var salario: Double = 3500.50    // Tipo Double
    var ativo: Boolean = true       // Tipo Boolean

    // Usando a estrutura de decisão (if)
    if (idade >= 18) {
        println("$nome é maior de idade.")
    } else {
        println("$nome é menor de idade.")
    }

    // Criando uma instância da classe Pessoa
    val pessoa = Pessoa(nome, idade)

    // Chamando a função saudacao
    println(pessoa.saudacao())

    // Usando a estrutura de repetição (for)
    println("\nContagem de 1 até o número atual de 'numeroVariavel':")
    for (i in 1..numeroVariavel) {
        println(i)
    }

    // Alterando o valor de uma variável 'var'
    numeroVariavel = 15
    println("\nNúmero alterado: $numeroVariavel")

    // Verificando se a pessoa pode votar
    if (pessoa.podeVotar()) {
        println("${pessoa.nome} pode votar.")
    } else {
        println("${pessoa.nome} não pode votar.")
    }
}