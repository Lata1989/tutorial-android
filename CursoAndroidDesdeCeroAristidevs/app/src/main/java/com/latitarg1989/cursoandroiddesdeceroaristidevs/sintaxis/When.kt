package com.latitarg1989.cursoandroiddesdeceroaristidevs.sintaxis

fun main() {

    println("El mes es ${getMonth(14)}.")
    println("El mes es ${getMonth(14)}.")
    resultado(14)

}

fun getMonth( mes : Int) : String {
    var mesLetra : String = ""
    when (mes) {
        1 -> mesLetra = "Enero"
        2 -> mesLetra = "Febrero"
        3 -> mesLetra = "Marzo"
        4 -> mesLetra = "Abril"
        5 -> mesLetra = "Mayo"
        6 -> mesLetra = "Junio"
        7 -> mesLetra = "Julio"
        8 -> mesLetra = "Agosto"
        9 -> mesLetra = "Septiembre"
        10 -> mesLetra = "Octubre"
        11 -> mesLetra = "Noviembre"
        12 -> mesLetra = "Diciembre"
        else -> mesLetra = "no es un mes valido!"
    }

    return mesLetra
}

fun getTrimestre(mes: Int) : String {
    var trimestre = ""

    when(mes) {
        1,2,3 -> trimestre = "primer trimestre"
        4,5,6-> trimestre = "segundo trimestre"
        7,8,9 -> trimestre = "tercer trimestre"
        10,11,12 -> trimestre = "cuarto trimestre"
        else -> "mes no valido"
    }

    return trimestre
}

fun getSemestre(mes: Int) : String {
    var semestre : String = ""
    when (mes) {
        in 1 .. 6 -> semestre = "primer semestre"
        in 7 .. 12 -> semestre = "segundo semestre"
        else -> semestre = "semestre no valido"
    }
    return semestre
}

fun resultado (valor : Any) {
    var tipo = valor::class.java
    println("El tipo de la variable valor es ${tipo}")

    when (valor) {
        is Int -> println("Es Int")
        is String -> println("Es String")
        is Boolean -> println("Es Boolean")
        else -> println("No es un tipo de dato primitivo.")
    }
}