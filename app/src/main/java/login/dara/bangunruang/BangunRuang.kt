package login.dara.bangunruang

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class BangunRuang : AppCompatActivity() {

    private lateinit var txtruang: TextView
    private lateinit var txtTinggi: EditText
    private lateinit var txtLebar: EditText
    private lateinit var txtPanjang: EditText
    private lateinit var txtHasil: TextView
    private lateinit var btnHitung: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContentView(R.layout.activity_bangun_ruang)

        txtruang = findViewById(R.id.txtruang)
        txtTinggi = findViewById(R.id.txtTinggi)
        txtLebar = findViewById(R.id.txtLebar)
        txtPanjang = findViewById(R.id.txtPanjang)
        txtHasil = findViewById(R.id.txtHasil)
        btnHitung = findViewById(R.id.btnHitung)


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        btnHitung.setOnClickListener {
            val panjang = txtPanjang.text.toString().toDoubleOrNull()
            val tinggi = txtTinggi.text.toString().toDoubleOrNull()
            val lebar = txtLebar.text.toString().toDoubleOrNull()

            if (panjang != null && tinggi != null && lebar != null) {
                // Calculate Volume
                val volume = panjang * tinggi * lebar
                val luasPermukaan = 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi)

                // Display Results
                txtHasil.text = "Volume: $volume\nLuas Permukaan: $luasPermukaan"
            } else {
                txtHasil.text = "Input tidak valid!"
            }
        }
    }
}


