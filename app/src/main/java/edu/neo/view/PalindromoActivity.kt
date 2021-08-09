package edu.neo.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.lifecycle.ViewModelProvider
import edu.neo.R
import edu.neo.model.Frase
import edu.neo.viewmodel.PalindromoViewModel

class PalindromoActivity : AppCompatActivity() {

    lateinit var volverAintentar: Button
    lateinit var chequearPalindromo: Button
    lateinit var frase: EditText
    lateinit var esPalindromo: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_palindromo)

        inicializarElementos()

        val palindromoVM = ViewModelProvider(this).get(PalindromoViewModel::class.java)

        chequearPalindromo.setOnClickListener(
            View.OnClickListener {

                var fraseIngresada = frase.text.toString().lowercase()

                if (palindromoVM.EsPalindromo(fraseIngresada)) {
                    mostrarTextview(esPalindromo)
                }
                else  mostrarToastmensaje("NO ES UN PALINDROMO")
            }
        )


        volverAintentar.setOnClickListener(
            View.OnClickListener {

                frase.setText(null)

                if(esPalindromo.visibility == TextView.VISIBLE){

                    ocultarTextview(esPalindromo)
                }
            }
        )
    }


    fun inicializarElementos(){
        volverAintentar = findViewById(R.id.b_volver_palindromo)
        chequearPalindromo = findViewById(R.id.b_chequear_palindromo)
        frase = findViewById(R.id.e_frase)
        esPalindromo = findViewById(R.id.t_esPalindromo)
    }

    fun mostrarToastmensaje(mensaje: String){

        Toast.makeText(this, mensaje, Toast.LENGTH_LONG).show()
    }

    fun mostrarTextview(textView : TextView){

        textView.setVisibility(TextView.VISIBLE)
    }

    fun ocultarTextview(textView : TextView){

        textView.setVisibility(TextView.INVISIBLE)
    }

}