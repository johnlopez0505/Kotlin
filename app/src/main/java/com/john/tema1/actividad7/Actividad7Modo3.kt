package com.john.tema1.actividad7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.john.tema1.R

class Actividad7Modo3 : AppCompatActivity() {
    private lateinit var btnSaludo : Button
    private lateinit var txtSaludar : TextView
    private lateinit var botonNoSaludar : Button
    private lateinit var botonSaludarClase : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad7_modo3)

        btnSaludo = findViewById(R.id.btnSaludar)
        txtSaludar = findViewById(R.id.txt_saludar)
        botonNoSaludar = findViewById(R.id.botonNoSaludar)
        botonSaludarClase = findViewById(R.id.btn_saludar_clase)

    }

    fun btnSaludar(v1: View) {
        if(v1.id == R.id.btnSaludar){
            Toast.makeText(this,"Hola john!!!!", Toast.LENGTH_LONG).show()
            txtSaludar.text = "Hola john como estas!!!!"
        }
        if(v1.id == R.id.botonNoSaludar){
            Toast.makeText(this,"No quiero saludar a john!!!! ", Toast.LENGTH_LONG).show()
            txtSaludar.text = "No quiero saludar a john!!!!!!"
        }
        if(v1.id == R.id.btn_saludar_clase){
            Toast.makeText(this,"Os saludo, clase PMDM 23/24 !!!!", Toast.LENGTH_LONG).show()
            txtSaludar.text= "Os saludo, clase PMDM 23/24 !!!!"
        }
    }

}