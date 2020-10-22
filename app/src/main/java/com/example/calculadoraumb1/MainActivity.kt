package com.example.calculadoraumb1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var num1: Double = 0.0
    private var num2: Double = 0.0


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

        clearBtn.setOnClickListener { resetAll() }




    }


    //Función cuando se presiona clear
    private fun resetAll(){
        resultadoText.text = "0"
        num1 = 0.0
        num2 = 0.0
    }

    //Función cuando se presiona un número
    private fun numberPressed(num: String){
        if(resultadoText.text == "0" && num != ".") {
            resultadoText.text = "$num"
        } else {
            resultadoText.text = "${resultadoText.text}$num"
        }
    }

}