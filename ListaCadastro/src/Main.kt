package org.kotlinlang.play

data class Pessoa(val nome: String, val idade: Double, val cpf: String, var voto: Boolean = false)

fun main() {

    val listaPessoa = mutableListOf<Pessoa>()
    var contadorPessoas = 0 // Inicializa o contador

    while (true) {
        println("Digite 'cadastrar' para começar o cadastro ou 'exit' para sair:")
        val entrada = readLine() ?: ""

        if (entrada.equals("exit", ignoreCase = true)) {
            break // Sai do loop se o usuário digitar "exit"
        }

        if (entrada.equals("cadastrar", ignoreCase = true)) {
            println("Digite o nome da pessoa:")
            val nome = readLine() ?: ""

            println("Digite a idade:")
            val idade = readLine()?.toDoubleOrNull() ?: 0.0

            println("Digite o CPF:")
            val cpf = readLine() ?: ""

            val podeVotar = idade >= 16 // Determina se a pessoa pode votar
            val pessoa = Pessoa(nome, idade, cpf, podeVotar) // Cria a pessoa com o voto

            listaPessoa.add(pessoa)
            contadorPessoas++

            println("Pessoa cadastrada com sucesso!")

            // Verifica a idade e exibe a mensagem de votação
            if (pessoa.voto) {
                if (idade >= 18) {
                    println("$nome é maior de idade e pode votar.")
                } else {
                    println("$nome é menor de idade, mas pode votar.")
                }
            } else {
                println("$nome é menor de idade e não pode votar.")
            }

        } else {
            println("Entrada inválida. Digite 'cadastrar' ou 'exit'.")
        }
    }

    println("Número de pessoas na Lista: $contadorPessoas")

    println("Lista de pessoas cadastradas:")
    for (pessoa in listaPessoa) {
        println(pessoa) // Imprime cada pessoa na lista
    }
}