package com.antonio.introkotlin903.temasKotlin

fun main(){
    /*
    Range
    1..4= 1,2,3,4
    1..<4= 1,2,3
    4 downTo 1 = 4,3,2,1
    1..5 step 2 = 1,3,5
    'a'..'z'= a,b,c,d,e,f,g,h,i
     */

    for(num in 1..5){
        println(num)
    }
    var frutas = listOf("Manzana","Pera","Frambuesa","Durazno")
    for(fruta in frutas){
        println(fruta)
    }

    val n=10
        var d=0
        while (d<n) {
            println(d)
            d++
        }
        /*
        Practica3= Imprimir una piramide de * segun el numero dado por el usuario
        n=5
        *
        **
        ***
        ****
        *****
        cuando se capture un 0 terminar el programa utilizando puro do-while
        practica3: formula general de la serie de fibonacci
         */
}