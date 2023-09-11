package com.latitarg1989.cursoandroiddesdeceroaristidevs.sintaxis

fun main() {

    // Capitulo 5 - If Else
    ifBasico()

}

fun ifBasico() {
    var nombre : String = "Tito"
    if (nombre == "Latita") {
        println("El nombre es Latita! Si señor!")
    }
    else
    {
        println("El nombre es ${nombre}!")
    }
}

fun ifAnidado() {
    val animal = "Perrito"
    val otroAnimal = "Gatito"

    if ( animal == "Perrito") {
        println("Es un perrito!")
    }
    else if (animal == "Gatito") {
        println("Es un gatito!.")
    }
    else
    {
        println("No es un perrito!.")
    }
}

fun ifBoolean() {
    var soyFeliz = true

    if (soyFeliz) {
        println("Eres feliz")
    }
    else{
        print("Estas triste!")
    }
}

fun ifInt() {
    var edad = 34

    if (edad >= 18) {
        println("Puede beber cerveza")
    }
    else{
        println("No puede beber cerveza")
    }
}

fun ifMultipleAnd() {
    var age = 34
    var permiso = true
    var feliz = true

    if(age >= 18 && permiso == true && feliz == true) {
        println("Puedes beber cerveza!")
    }
}

fun ifMultipleOr() {
    var pet = "dog"

    if (pet == "dog" || pet == "cat") {
        println("Es un gato o un perro")
    }
}