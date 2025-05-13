package com.antonio.introkotlin903.temasKotlin

fun saludo(){
    return println("Hola mundo")
}
fun sum(x: Int, y: Int): Int {
    return x + y
}

//función de linea, quitas el return y devuelve el resultado en la misma linea
fun sum2(x: Int, y: Int) = x + y

fun main(){
    saludo()
    println("_______________________________________________________________________________________")
    println(sum(2,3))
    println(sum2(2,3))
}