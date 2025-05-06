package com.antonio.introkotlin903.temasKotlin

fun main() {
    var numero: Int

    do {
        println("1. Suma")
        println("2. Resta")
        println("3. Multiplicacion")
        println("4. División")
        println("5. Salir")
        print("Elige una opcion: ")
        numero = readln().toInt()

        if (numero == 1) {
            println("Ingrese el primer número: ")
            val num1 = readln().toDouble()
            println("Ingrese el segundo número: ")
            val num2 = readln().toDouble()
            val resultado = num1 + num2
            println("El resultado es: $resultado\n")

        } else if (numero == 2) {
            println("Ingrese el primer número: ")
            val num1 = readln().toDouble()
            println("Ingrese el segundo número: ")
            val num2 = readln().toDouble()
            val resultado = num1 - num2
            println("El resultado es: $resultado\n")

        } else if (numero == 3) {
            println("Ingrese el primer número: ")
            val num1 = readln().toDouble()
            println("Ingrese el segundo número: ")
            val num2 = readln().toDouble()
            val resultado = num1 * num2
            println("El resultado es: $resultado\n")

        } else if (numero == 4) {
            println("Ingrese el primer número: ")
            val num1 = readln().toDouble()
            println("Ingrese el segundo número: ")
            val num2 = readln().toDouble()
            val resultado = num1 / num2
            println("El resultado es: $resultado\n")

        } else if (numero == 5) {
            println("¡Hasta luego!")
        } else {
            println("Opción inválida.\n")
        }

    } while (numero != 5)
}
