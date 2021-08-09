package edu.neo.viewmodel

import androidx.lifecycle.ViewModel

class TemperaturaViewModel: ViewModel() {

    fun CelciusAFarenheit(celcius: Double) : Double{
       var farenheit = (celcius * 9/5) + 32
        return farenheit
    }

    fun FarenheitACelcius(farenheit: Double) : Double {
       var celcius = (farenheit - 32) * 5/9
        return celcius
    }

}