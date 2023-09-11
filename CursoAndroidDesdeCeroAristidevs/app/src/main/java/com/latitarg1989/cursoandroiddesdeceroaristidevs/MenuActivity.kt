package com.latitarg1989.cursoandroiddesdeceroaristidevs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.latitarg1989.cursoandroiddesdeceroaristidevs.firstapp.FirstAppActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btnSaludapp = findViewById<Button>(R.id.btnSaludapp)
        btnSaludapp.setOnClickListener {
            navigateToSaludapp()
        }
    }

    private fun navigateToSaludapp() {
        val intent = Intent(this, FirstAppActivity::class.java)
        startActivity(intent)
    }
}