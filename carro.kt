package com.turma308b.exerciciosmobile

import java.util.Scanner

class Carro(val modelo: String, val marca: String, val ano: Int) {
    fun descricao(): String {
        return "Modelo: $modelo, Marca: $marca, Ano: $ano"
    }
}

fun main() {
    val scanner = Scanner(System.`in`)

    println("Digite o modelo do carro:")
    val modelo = scanner.nextLine()

    println("Digite a marca do carro:")
    val marca = scanner.nextLine()

    println("Digite o ano do carro:")
    val ano = scanner.nextInt()
    scanner.nextLine() // Consumir a quebra de linha deixada pelo nextInt()

    val meuCarro = Carro(modelo, marca, ano)
    println("\nDescrição do carro:")
    println(meuCarro.descricao())

    scanner.close()
}