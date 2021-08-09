package edu.neo.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import edu.neo.R

class MainActivity : AppCompatActivity() {

    lateinit var palindromoActivity: Button
    lateinit var temperaturaActivity: Button
    lateinit var fibonacciActivity: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        inicilizarElementos()

        palindromoActivity.setOnClickListener(
            View.OnClickListener {

                val intent = Intent(this, PalindromoActivity::class.java)
                startActivity(intent)
            }
        )

        temperaturaActivity.setOnClickListener(
            View.OnClickListener {

                val intent = Intent(this,ConvTemperaturaActivity::class.java)
                startActivity(intent)
            }
        )

        fibonacciActivity.setOnClickListener(
            View.OnClickListener {

                val intent = Intent(this,FibonacciActivity::class.java)
                startActivity(intent)
            }
        )

    }



        private fun inicilizarElementos() {
            palindromoActivity = findViewById(R.id.b_palindromoActivity)
            temperaturaActivity = findViewById(R.id.b_temperaturaActivity)
            fibonacciActivity = findViewById(R.id.b_fibonacciActivity)

        }


    }
