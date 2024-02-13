package mx.edu.itson.potros.examenu1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvCentigrados: TextView = findViewById(R.id.tvCampoCentigrados)
        val tvFahrenheit: TextView = findViewById(R.id.tvCampoFahrenheit)
        val btnGC: Button = findViewById(R.id.btnGC)
        val btnGF: Button = findViewById(R.id.btnGF)

        btnGC.setOnClickListener {
            val fahrenheit = tvFahrenheit.text.toString().toFloat()
            val centigrados = (fahrenheit - 32) / 1.8
            tvCentigrados.text = centigrados.toString()
        }

        btnGF.setOnClickListener {
            val centigrados = tvCentigrados.text.toString().toFloat()
            val fahrenheit = centigrados * 1.8 + 32
            tvFahrenheit.text = fahrenheit.toString()
        }
    }
}