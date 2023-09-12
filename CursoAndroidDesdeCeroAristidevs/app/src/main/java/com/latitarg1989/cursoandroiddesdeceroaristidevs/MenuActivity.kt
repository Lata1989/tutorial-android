package com.latitarg1989.cursoandroiddesdeceroaristidevs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.latitarg1989.cursoandroiddesdeceroaristidevs.firstapp.FirstAppActivity
import com.latitarg1989.cursoandroiddesdeceroaristidevs.imccalculator.IMCCalculatorActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btnSaludapp = findViewById<Button>(R.id.btnSaludapp)

        btnSaludapp.setOnClickListener {
            navigateToSaludapp()
        }

        val btnIMCApp = findViewById<Button>(R.id.btnIMCApp)

        btnIMCApp.setOnClickListener {
            navigateToIMCApp()
        }


        // Ultima linea de codigo del main
    }

    private fun navigateToSaludapp() {
        val intent = Intent(this, FirstAppActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToIMCApp() {
        val intent = Intent(this, IMCCalculatorActivity::class.java)
        startActivity(intent)
    }
}