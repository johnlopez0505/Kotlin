package com.john.tema1.actividad6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.john.tema1.R

class Actividad6 : AppCompatActivity() {
    private lateinit var boton : Button
    private lateinit var txtSaludo : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad6)

        boton = findViewById(R.id.boton)
        txtSaludo = findViewById(R.id.text)
    }
    fun pulsarBoton(v : View){
        Toast.makeText(this,"que haces?", Toast.LENGTH_SHORT).show();
        txtSaludo.text = "Cambio de texto"
    }
}