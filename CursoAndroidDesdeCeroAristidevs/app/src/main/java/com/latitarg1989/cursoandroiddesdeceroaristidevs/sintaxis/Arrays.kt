package com.latitarg1989.cursoandroiddesdeceroaristidevs.sintaxis

fun main() {

    var diaDeLaSemana = arrayOf<String>("Lunes", "Martes", "Miercoles", "Jueves", "Viernes",
        "Sabado", "Domingo")

    println("${diaDeLaSemana[3]}")

    println(diaDeLaSemana.size)

    // Bucles
    for ((index, elemento) in diaDeLaSemana.withIndex()) {
        println("El dia de la semana $index es ${elemento}.")
    }

    for (position in diaDeLaSemana.indices){
        println("${diaDeLaSemana[position]}")
    }

    for (dia in diaDeLaSemana) {
        println("Hoy es ${dia}.")
    }
}