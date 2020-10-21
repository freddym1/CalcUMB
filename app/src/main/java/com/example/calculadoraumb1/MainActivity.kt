package com.example.calculadoraumb1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Eventos de los botones
        unoBtn.setOnClickListener { numberPressed("1") }
        dosBtn.setOnClickListener { numberPressed("2") }
        tresBtn.setOnClickListener { numberPressed("3") }
        cuatroBtn.setOnClickListener { numberPressed("4") }
        cincoBtn.setOnClickListener { numberPressed("5") }
        seisBtn.setOnClickListener { numberPressed("6") }
        sieteBtn.setOnClickListener { numberPressed("7") }
        ochoBtn.setOnClickListener { numberPressed("8") }
        nueveBtn.setOnClickListener { numberPressed("9") }
        ceroBtn.setOnClickListener { numberPressed("0") }
        puntoBtn.setOnClickListener { numberPressed(".") }

    }

    //Función cuando se presiona un número
    private fun numberPressed(num: String){
            resultadoText.text = "${resultadoText.text}$num"
    }

}