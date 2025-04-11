fun calculadora() {

    print("Digite o primeiro número inteiro: ")
    val numero1 = readLine()?.toIntOrNull()

    print("Digite o segundo número inteiro: ")
    val numero2 = readLine()?.toIntOrNull()

    print("Digite a operação (+, -, *, /): ")
    val operacao = readLine()

    if (numero1 != null && numero2 != null && operacao != null) {
        val resultado = calcular(numero1, numero2, operacao)
        println("Resultado: $resultado")
    } else {
        println("Entrada inválida. Certifique-se de digitar números inteiros e uma operação válida.")
    }
}

fun calcular(numero1: Int, numero2: Int, operacao: String): Any {
    return when (operacao) {
        "+" -> numero1 + numero2
        "-" -> numero1 - numero2
        "*" -> numero1 * numero2
        "/" -> {
            if (numero2 != 0) {
                numero1 / numero2.toDouble()
            } else {
                "Erro: Divisão por zero"
            }
        }
        else -> "Operação inválida"
    }
}

fun main() {
    calculadora()
}