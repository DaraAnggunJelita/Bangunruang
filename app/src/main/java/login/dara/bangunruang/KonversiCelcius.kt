package login.dara.bangunruang

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class KonversiCelcius : AppCompatActivity() {

    private lateinit var txtAngka: EditText
    private lateinit var txtKonversi: TextView
    private lateinit var btnKelvin: Button
    private lateinit var btnFaranheid: Button
    private lateinit var btnReamor: Button
  //  private lateinit var txthasil: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_konversi_celcius)

        txtAngka = findViewById(R.id.txtAngka)
        txtKonversi = findViewById(R.id.txtkonversi)
        btnKelvin = findViewById(R.id.btnkelvin)
        btnReamor = findViewById(R.id.btnReamor)
        btnFaranheid = findViewById(R.id.btnFarenheid)

        btnFaranheid.setOnClickListener {
            val celsius = txtAngka.text.toString().toFloatOrNull() ?: 0f
            val fahrenheit = celsius * 9 / 5 + 32
            txtKonversi.text = "Fahrenheit: $fahrenheit"
        }

        btnKelvin.setOnClickListener {
            val celsius = txtAngka.text.toString().toFloatOrNull() ?: 0f
            val kelvin = celsius + 273.15
            txtKonversi.text = "Kelvin: $kelvin"
        }


        btnReamor.setOnClickListener {
            val celsius = txtAngka.text.toString().toFloatOrNull() ?: 0f
            val reamor = celsius * 4 / 5
            txtKonversi.text = "Reamur: $reamor"
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}