package com.antonio.introkotlin903.temasKotlin

fun main(){
    println("Introduce el valor de a:")
    var a = readln().toInt()
    println("Introduce el valor de b:")
    var b = readln().toInt()
    println("Introduce el valor de c:")
    var c = readln().toInt()
    var n=0
    var comprobacion=b*b - 4 * a * c
    while (comprobacion>0){
        var x1 = (-b + Math.sqrt(comprobacion.toDouble())) / (2 * a)
        var x2 = (-b - Math.sqrt(comprobacion.toDouble())) / (2 * a)
        println("Las raices son $x1 y $x2")
        n++

    }
}