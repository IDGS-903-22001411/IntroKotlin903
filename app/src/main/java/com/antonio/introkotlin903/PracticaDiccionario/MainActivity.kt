package com.antonio.introkotlin903.PracticaDiccionario

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.antonio.introkotlin903.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val capturar = findViewById<Button>(R.id.btnCapturar)
        val buscar = findViewById<Button>(R.id.btnBuscar)

        capturar.setOnClickListener {
            navigateToCapturar()
        }

        buscar.setOnClickListener {
            navigateToBuscar()
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    private fun navigateToCapturar() {
        val intent = Intent(this, AgregarActivity::class.java)
        startActivity(intent)
    }
    private fun navigateToBuscar() {
        val intent = Intent(this, BuscarActivity::class.java)
        startActivity(intent)
    }
}