package com.antonio.introkotlin903.practicaCine

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast
import com.antonio.introkotlin903.R

class cine : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cine)

        val btnCalcular: Button = findViewById(R.id.btnCalcular)
        val edtNombre: EditText = findViewById(R.id.edtNombre)
        val edtCC: EditText = findViewById(R.id.edtCC)
        val rbS: RadioButton = findViewById(R.id.rbS)
        val edtCB: EditText = findViewById(R.id.edtCB)
        val textCantPagar: TextView = findViewById(R.id.textCantPagar)

        btnCalcular.setOnClickListener {
            if (edtNombre.text.isEmpty() || edtCC.text.isEmpty() || edtCB.text.isEmpty() ||
                (!rbS.isChecked && !findViewById<RadioButton>(R.id.rbN).isChecked)) {
                Toast.makeText(this, "Completa todos los campos", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val nombre = edtNombre.text.toString()
            val cantidadCompradores = edtCC.text.toString().toInt()
            val cantidadBoletos = edtCB.text.toString().toInt()
            val tieneTarjetaCineco = rbS.isChecked
            val precioUnitario = 12.00

            if (cantidadBoletos > 7 * cantidadCompradores) {
                Toast.makeText(this, "No puedes comprar más de 7 boletos por persona", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            var valorTotal = cantidadBoletos * precioUnitario

            valorTotal = when {
                cantidadBoletos > 5 -> valorTotal * 0.85
                cantidadBoletos in 3..5 -> valorTotal * 0.90
                else -> valorTotal
            }

            if (tieneTarjetaCineco) {
                valorTotal *= 0.90
            }

            textCantPagar.text = "$${String.format("%,.2f", valorTotal)}"

            Toast.makeText(this, "Compra calculada para $nombre", Toast.LENGTH_SHORT).show()
        }
    }
}