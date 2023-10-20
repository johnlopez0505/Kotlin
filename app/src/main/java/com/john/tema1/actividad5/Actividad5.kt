package com.john.tema1.actividad5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.john.tema1.R

private const val TAG = "vistaActiv"
class Actividad5 : AppCompatActivity() {
    private  var variable1 = "inicio"
    private  var variable2 = 5
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad5)

        variable1 = "se crea una instancia"
        variable2 = 0
        Log.d("Actividad5","variable1: $variable1,variable2: $variable2")
    }
    override fun onStart() {
        super.onStart()
        Log.d(TAG, "Se llama después de onCreate. JOHN, muestro la pantalla. " +
                "El usuario aún no puede interaccionar")
        variable1 = "iniciamos"
        variable2 = 1
        Log.d("Actividad5","variable1: $variable1,variable2: $variable2")
        val objetoA = ClaseA("informatica", 2, 30)
        Log.d("MiActivity", objetoA.toString())
        Toast.makeText(this, objetoA.toString(), Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "El usuario ya puede interaccionar con la pantalla")
        variable1 = "reactivamos"
        variable2 = 2
        Log.d("Actividad5","variable1: $variable1,variable2: $variable2")
    }
    override fun onPause() {
        super.onPause()
        Log.d(TAG, "Pierdo el foco de la pantalla. Boton home")
        variable1 = "pausamos"
        variable2 = 3
        Log.d("Actividad5","variable1: $variable1,variable2: $variable2")
    }
    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "Vuelvo a estar visible para JOHN.")
        variable1 = "Reiniciamos"
        variable2 = 4
        Log.d("Actividad5","variable1: $variable1,variable2: $variable2")
    }
    override fun onStop() {
        super.onStop()
        Log.d(TAG, "Dejo de estar visible para el usuario. Otra App, S.O.")
        variable1 = "paramos"
        variable2 = 5
        Log.d("Actividad5","variable1: $variable1,variable2: $variable2")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "La actividad muere.")
        variable1 = "destruimos"
        variable2 = 6
        Log.d("Actividad5","variable1: $variable1,variable2: $variable2")
    }

}
class ClaseA{
    private var nombre = "clase1"
        get() {
            return field
        }
        set(value) {
            field = value
        }
    private var tamanno = 0
        get() {
            return field
        }
        set(value) {
            field = value
        }
    private var cantidad = 0
        get() {
            return field
        }
        set(value) {
            field = value
        }

    constructor(nombre: String, tamanno: Int, cantidad: Int) {
        this.nombre = nombre
        this.tamanno = tamanno
        this.cantidad = cantidad
    }

    constructor()

    override fun toString(): String {
        return "ClaseA(nombre='$nombre', tamaño=$tamanno, cantidad=$cantidad)"
    }
}
