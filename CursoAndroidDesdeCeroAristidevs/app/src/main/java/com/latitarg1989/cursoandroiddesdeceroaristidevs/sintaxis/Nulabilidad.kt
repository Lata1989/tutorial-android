package com.latitarg1989.cursoandroiddesdeceroaristidevs.sintaxis

fun main() {
    var nombre : String? = null

    println("El nombre es ${nombre}.")
    // Con los dos !! despues del nombre de la variable aseguro que no es null ${nombre!![0]}
    // Con los ? despues del nombre de la variable puede ser null ${nombre?[0]}

    println("El primer caracter del nombre es ${nombre?.get(2)}.")

}