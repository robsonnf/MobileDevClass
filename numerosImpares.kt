package com.turma308b.exerciciosmobile

import java.util.Scanner

fun imprimirImparesAte(limite: Int) {
    if (limite < 1) {
        println("O limite deve ser um número inteiro maior ou igual a 1.")
        return
    }

    println("Números ímpares de 1 até $limite:")
    for (i in 1..limite step 2) {
        println(i)
    }
}

fun main() {
    val scanner = Scanner(System.`in`)

    println("Digite um número inteiro positivo:")
    val numero = scanner.nextInt()

    imprimirImparesAte(numero)

    scanner.close()
}