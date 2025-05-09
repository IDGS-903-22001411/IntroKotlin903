package com.antonio.introkotlin903.temasKotlin

fun main(){
    do{
        print("Elige un numero: ")
        var numero = readln().toInt()
        var n=0
        var asterisco= ""
        do {
            asterisco+="*"
            println(asterisco)
            n++
        }while (n<numero)
    }while(numero!= 0)
}