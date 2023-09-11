package com.latitarg1989.cursoandroiddesdeceroaristidevs.sintaxis

fun main() {

    // Capitulo 1 - Variables
    // Capitulo 2 - Trabajando con variables
    // variablesNumericas()
    // variablesAlfanumericas()
    // variablesBooleanas()

    // Capitulo 3 - Funciones

//    variablesNumericas()
//    variablesAlfanumericas()
//    variablesBooleanas()

    // Capitulo 4 - Funciones con parametros

//    showMyName("Latita")
//    showMyAge(34)

    // Funcion con parametro de entrada por defecto
//    conParametroPorDefecto(75)

    // Funciones con salida
//    var isFalse : Boolean = false
//    var isTrue : Boolean = true
//    var result : Boolean = operacionAnd(isFalse, isTrue)
//    println("${isFalse} && ${isTrue} = ${result}")
//    result = operacionOr(isFalse, isTrue)
//    println("${isFalse} || ${isTrue} = ${result}")


    // Capitulo 5 - En File IfElse


    // Ultima linea de codigo de la funcion main


}

// Declaraciones de funciones
// Funciones basicas, ni parametros de entrada ni salida
fun variablesNumericas() {
    // Capitulo 1 declaracion de variables

    // Declaracion de variables es con la palabra var y constantes con la palabra val
    /*
    Tipos de datos numericos

    Int
    Long
    Float (con f al final del numero)
    Double

    Tipos de datos alfanumericos
    Char va entre comillas simples 'a'
    String

    Tipos de datos booleanos
    Boolean

     */

//    var nombre: String = "Latita"
//    val age: Int = 30
//    var age2 : Int = 40
//    println("Hola ${nombre}! Tienes ${age} años!");

    // Trabajando con variables

//    println("Sumar ${age} + $age2 = ${age + age2}")
//    println("Restar ${age} - $age2 = ${age - age2}")
//    println("Multiplicar ${age} - $age2 = ${age * age2}")
//    println("Divir ${age} - $age2 = ${age / age2}")
//    println("Resto ${age} - $age2 = ${age % age2}")

    // Variables de ejemplo

    var int1: Int = 13
    var int2: Int = 4

    var float1: Float = 14.156633f
    var float2: Float = 12.132556f

    var long1: Long = 12333
    var long2: Long = 1561613

    var double1: Double = 132.1314651
    var double2: Double = 1459.132956

}

fun variablesAlfanumericas() {
    var string1: String = "Hola"
    var string2: String = "mundo"
    var char1: Char = 'A'
    var char2: Char = 'B'
}

fun variablesBooleanas() {
    var bool1: Boolean = true
    var bool2: Boolean = false
}

// Funciones con parametros de entrada
fun showMyName(nombre: String) {
    println("Hola ${nombre}!.")
}

fun showMyAge(edad: Int) {
    println("Tienes ${edad} años!.")
}

fun conParametroPorDefecto(unNumero : Int = 30 ) {
    println("El numero enviado es ${unNumero}")
}
fun operacionAnd(unBool : Boolean, otroBool : Boolean) : Boolean {
    return unBool && otroBool
}

fun operacionOr(unBool : Boolean, otroBool : Boolean) : Boolean {
    return unBool || otroBool
}

