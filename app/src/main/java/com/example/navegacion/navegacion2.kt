package com.example.navegacion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

import com.example.navegacion.databinding.ActivityNavegacion2Binding

class navegacion2 : AppCompatActivity() {

    lateinit var mostrar : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val enlace = ActivityNavegacion2Binding.inflate(layoutInflater)

        val intencion :Intent=intent
        val nombre=intencion.getStringExtra("datos")

        mostrar = enlace.texto



        mostrar.setText(nombre.toString())

        setContentView(enlace.root)


    }
    fun salir(view: View){
        finish()
    }
}