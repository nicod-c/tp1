package edu.neo.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import edu.neo.R
import edu.neo.viewmodel.TemperaturaViewModel
import org.w3c.dom.Text


class ConvTemperaturaActivity : AppCompatActivity() {

    lateinit var convertir_caf : Button
    lateinit var convertir_fac : Button
    lateinit var celcius : EditText
    lateinit var farenheit:EditText
    lateinit var caf : TextView
    lateinit var fac: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_conv_temperatura)

        inicializarElementos()

        val TemperaturaVM = ViewModelProvider(this).get(TemperaturaViewModel::class.java)

        convertir_caf.setOnClickListener(
            View.OnClickListener {

                var cel = celcius.text.toString().toDouble()
                caf.setText(TemperaturaVM.CelciusAFarenheit(cel).toString() + " °F")
            }
        )

        convertir_fac.setOnClickListener(

            View.OnClickListener {
                var far = farenheit.text.toString().toDouble()
                fac.setText(TemperaturaVM.FarenheitACelcius(far).toString() + " °C")
            }
        )

    }


    fun inicializarElementos(){
        convertir_caf = findViewById(R.id.b_convertir_CaF)
        convertir_fac = findViewById(R.id.b_convertir_FaC)
        celcius = findViewById(R.id.e_celcius)
        farenheit = findViewById(R.id.e_farenheit)
        caf = findViewById(R.id.t_Caf)
        fac = findViewById(R.id.t_Fac)
    }
}