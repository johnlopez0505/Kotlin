package com.john.tema1.actividad7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.john.tema1.R

class Actividad7 : AppCompatActivity() {
    private lateinit var btnSaludo : Button
    private lateinit var txtSaludar : TextView
    private lateinit var botonNoSaludar : Button
    private lateinit var botonSaludarClase : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad7)

        initEvent()
    }
    private fun initEvent(){
        btnSaludo = findViewById(R.id.btnSaludar)
        txtSaludar = findViewById(R.id.txt_saludar)
        botonNoSaludar = findViewById(R.id.botonNoSaludar)
        botonSaludarClase = findViewById(R.id.btn_saludar_clase)


        btnSaludo.setOnClickListener {
            Toast.makeText(this,"Hola john!!!!", Toast.LENGTH_LONG).show()
            txtSaludar.text = "Hola john como estas!!!!"
        }
        botonNoSaludar.setOnClickListener {
            Toast.makeText(this,"No quiero saludar a john!!!! ", Toast.LENGTH_LONG).show()
            txtSaludar.text = "No quiero saludar a john!!!!!!"
        }

        botonSaludarClase.setOnClickListener {
            Toast.makeText(this,"Os saludo, clase PMDM 23/24!!!!!!", Toast.LENGTH_LONG).show()
            txtSaludar.text= "Os saludo, clase PMDM 23/24!!!!!"
        }

    }

}
