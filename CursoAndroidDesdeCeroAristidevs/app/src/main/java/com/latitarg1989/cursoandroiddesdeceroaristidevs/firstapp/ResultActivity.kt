package com.latitarg1989.cursoandroiddesdeceroaristidevs.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.latitarg1989.cursoandroiddesdeceroaristidevs.R

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        var tvResult = findViewById<TextView>(R.id.tvResult)
        val name: String = intent.extras?.getString("EXTRA_NAME").orEmpty()
        tvResult.text = "Hola ${name}."
    }

}