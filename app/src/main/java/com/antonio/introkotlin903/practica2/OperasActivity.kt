package com.antonio.introkotlin903.practica2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.antonio.introkotlin903.R

class OperasActivity : AppCompatActivity() {

    // Objetos del tipo de elementos que usamos en el activity
    private lateinit var edit1: EditText
    private lateinit var edit2: EditText
    private lateinit var btn1: Button
    private lateinit var tv1: TextView
    private lateinit var Grupo1: RadioGroup
    private lateinit var r1: RadioButton
    private lateinit var r2: RadioButton
    private lateinit var r3: RadioButton
    private lateinit var r4: RadioButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_operas)
        edit1 = findViewById(R.id.edit1)
        edit2 = findViewById(R.id.edit2)
        btn1 = findViewById(R.id.btn1)
        tv1 = findViewById(R.id.tv1)
        r1 = findViewById(R.id.r1)
        r2 = findViewById(R.id.r2)
        r3 = findViewById(R.id.r3)
        r4 = findViewById(R.id.r4)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    fun calcular(view: android.view.View){
        val num1 = edit1.text.toString().toDouble()
        val num2 = edit2.text.toString().toDouble()
        var operacion = 0.0;
        if (r1.isChecked){
            operacion = num1 + num2
        }
        if (r2.isChecked){
            operacion = num1 - num2
        }
        if (r3.isChecked){
            operacion = num1 * num2
        }
        if (r4.isChecked){
            operacion = num1 / num2
        }

        val resultado = "Resultado: $operacion"
        tv1.text = resultado
    }

}