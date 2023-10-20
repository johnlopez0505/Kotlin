package com.john.tema1.actividad1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.john.tema1.R

private const val TAG = "ejemplo"
class Actividad1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad1)

    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "Se llama después de onCreate. john, muestro la pantalla. El usuario aún no puede interaccionar")
    }
}