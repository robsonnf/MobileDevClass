package com.turma308b.exerciciosmobile

import java.util.Scanner

fun fatorialRecursivo(n: Int): Long {
    return when (n) {
        0 -> 1
        else -> n * fatorialRecursivo(n - 1)
    }
}


fun main() {
    val scanner = Scanner(System.`in`) // criação do metodo scanner;
    println("Digite um numero inteiro não negativo para calcular o fatorial: ")
    val numero = scanner.nextInt() // recebimento do valor digitado

    if (numero < 0){
        println("Erro: Por favor, digite um numero inteiro não negativo.") //validação para receber somente numeros positivos.
    } else {
        val resultado = fatorialRecursivo(numero)
        println(" O Fatorial de $numero é $resultado") // resultado
    }
    scanner.close() // é importante fechar o scanner para liberar recursos
}