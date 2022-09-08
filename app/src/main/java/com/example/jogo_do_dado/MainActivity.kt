package com.example.jogo_do_dado

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botaoJogar: Button = findViewById(R.id.button2)
        botaoJogar.setOnClickListener {
            jogarDado()
        }
    }

    private fun jogarDado() {
        val dado = Dado(numeroLados = 6)
        val jogaDado = dado.jogar()
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = jogaDado.toString()
    }
}

class Dado(val numeroLados: Int) {

    fun jogar(): Int {
        return (1..numeroLados).random()
    }
}

