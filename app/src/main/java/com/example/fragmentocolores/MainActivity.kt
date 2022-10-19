package com.example.fragmentocolores

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity(), Communicator {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




    }


    override fun onClickSumar() {

        var etiquetaResultado = this.findViewById<TextView>(R.id.resultado)

        var suma = Integer.parseInt(etiquetaResultado.text.toString())

        etiquetaResultado.text = (suma+1).toString()

    }

    override fun onClickRestar() {
        var etiquetaResultado = this.findViewById<TextView>(R.id.resultado)

        var resta = Integer.parseInt(etiquetaResultado.text.toString())

        etiquetaResultado.text = (resta-1).toString()

    }

}
