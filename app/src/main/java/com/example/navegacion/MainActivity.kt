package com.example.navegacion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import com.example.navegacion.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var edtext: EditText
    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        val enlace = ActivityMainBinding.inflate(layoutInflater)
        edtext = enlace.settext
        setContentView(enlace.root)

    }
    fun callwin(view:View){
        val op= Intent(this,navegacion2::class.java)
        var datos = edtext.text.toString()

        op.putExtra("datos" ,datos)


        startActivity(op)

    }
}