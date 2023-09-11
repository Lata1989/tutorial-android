package com.latitarg1989.cursoandroiddesdeceroaristidevs.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
// El import de abajo es el import del la R en el setContentView
import com.latitarg1989.cursoandroiddesdeceroaristidevs.R


class FirstAppActivity : AppCompatActivity() {
    // La funcion override fun es la que llama a la pantalla
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_app)
        //Al arrancar la pantalla, es el equivalente a la funcion
        // Con esto traigo al boton a la logica
        var btnStart = findViewById<AppCompatButton>(R.id.btnStart)

        // Traigo el campo de texto editable
        var etName = findViewById<AppCompatEditText>(R.id.etName)
//        etName.text.toString()

        btnStart.setOnClickListener {
            val nombre : String = etName.text.toString()
            if (nombre.isNotEmpty()){
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("EXTRA_NAME", nombre)
                startActivity(intent)
            }

        }
    }
}