package edu.neo.viewmodel

import androidx.lifecycle.ViewModel
import edu.neo.model.Frase

class PalindromoViewModel : ViewModel() {


    fun EsPalindromo(frase: String): Boolean{
     //   var fraseSintildes = QuitarTildes(frase)
        return FraseInverSinEspacios(frase) == QuitarEspacios(frase)
    }

    fun EsEspacio(unChar: Char): Boolean {
        return unChar == ' '
    }

    fun FraseInverSinEspacios(frase: String): String {
        var fraseInvertida = String()

        var i = frase.count() - 1

        while(i >= 0){
            if(!EsEspacio(frase[i])){
                fraseInvertida += frase[i]
            }
            --i
        }

        return fraseInvertida
    }

    fun QuitarEspacios(frase: String): String {
        var fraseSinEspacios = String()

        for (letra in frase) {
            if (!EsEspacio(letra)) {
                fraseSinEspacios += letra
            }
        }

        return fraseSinEspacios
    }

    /*
    fun QuitarTildes(frase: String): String {
        var fraseSintildes = frase
        var vocalesContildes = arrayOf('á','é','í','ó','ú', 'à', 'è', 'ù', 'ì', 'ò')

        for(letra in fraseSintildes) {
          if (vocalesContildes.contains(letra)) {
                when (letra) {
                    'á', 'à' -> fraseSintildes.replace(letra,'a')
                    'é', 'è' -> fraseSintildes.replace(letra,'e')
                    'í','ì' -> fraseSintildes.replace(letra, 'i')
                    'ó','ò' -> fraseSintildes.replace(letra,'o')
                    'ú','ù' -> fraseSintildes.replace(letra,'u')
                }
            }
        return fraseSintildes
        }
        */
}




