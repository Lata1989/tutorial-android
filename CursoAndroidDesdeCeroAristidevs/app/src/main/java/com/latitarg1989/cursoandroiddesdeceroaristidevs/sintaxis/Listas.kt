package com.latitarg1989.cursoandroiddesdeceroaristidevs.sintaxis

fun main() {
    //inmutableList()
    mutableList()
}

fun inmutableList() {
    var diasSemana: List<String> = listOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes",
        "Sabado", "Domingo")

    println("$diasSemana")
    println("${diasSemana.size}")
    println(diasSemana.last())
    println(diasSemana.first())
    for (elemento in diasSemana.indices) {
        println(elemento)
    }

    // Filtrar
    var ejemplo = diasSemana.filter { it.contains("a") }
    println(ejemplo)

    // Recorriendo listas
    diasSemana.forEach {
        weekDay -> println(weekDay)
    }
}
fun mutableList() {
    var diasSemana: MutableList<String> = mutableListOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes",
        "Sabado", "Domingo")

    println(diasSemana)

    diasSemana.add(4, "Latitaday")
    println(diasSemana)

    if (diasSemana.isEmpty()) {
        println("No voy a pintar nada porque esta vacia")
    }
    else
    {
        diasSemana.forEach { println(it) }
    }

    if (diasSemana.isNotEmpty()) {
        diasSemana.forEach { println("Hoy es $it.") }
    }

    for (item in diasSemana) {
        println(item)
    }
}