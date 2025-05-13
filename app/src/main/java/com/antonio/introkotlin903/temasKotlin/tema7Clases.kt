package com.antonio.introkotlin903.temasKotlin

class usuarios(){
    val materias:String=""
}

class usuarios2(val id:Int, val nombre:String){
    val materias:String=""
    fun hola(){
        println("Hola")
    }
}

fun main(){
    val alumno = usuarios()
    val alumno2 = usuarios2(1,"Carlos")

    println(alumno2.id)
    println(alumno2.nombre)
    alumno2.hola()
}