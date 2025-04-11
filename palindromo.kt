package com.turma308b.exerciciosmobile

import java.util.Scanner

fun isPalindrome(str: String): Boolean {
    val cleanedStr = str.toLowerCase().filter { it.isLetterOrDigit() }
    val reversedStr = cleanedStr.reversed()
    return cleanedStr == reversedStr
}

fun main() {
    val scanner = Scanner(System.`in`)

    while (true) {
        println("\n--- Verificador de Palíndromo ---")
        println("1. Inserir palavra/frase para verificar")
        println("2. Sair")
        print("Escolha uma opção: ")

        when (scanner.nextLine()) {
            "1" -> {
                print("Digite a palavra ou frase: ")
                val input = scanner.nextLine()
                if (isPalindrome(input)) {
                    println("\"$input\" é um palíndromo.")
                } else {
                    println("\"$input\" não é um palíndromo.")
                }
            }
            "2" -> {
                println("Saindo do programa.")
                break
            }
            else -> {
                println("Opção inválida. Tente novamente.")
            }
        }
    }

    scanner.close()
}