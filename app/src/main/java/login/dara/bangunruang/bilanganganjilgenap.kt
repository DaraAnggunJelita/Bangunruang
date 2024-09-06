package login.dara.bangunruang

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class bilanganganjilgenap : AppCompatActivity() {

    private lateinit var txtJudul : TextView
    private lateinit var txtNumber : EditText
    private lateinit var btnHitung : Button
    private lateinit var txtHasil  : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_bilanganganjilgenap)

        setContentView(R.layout.activity_bilanganganjilgenap)
        txtJudul = findViewById(R.id.txtJudul)
        txtNumber = findViewById(R.id.txtNumber)
        btnHitung = findViewById(R.id.btnHitung)
        txtHasil  = findViewById(R.id.txtHasil)

        btnHitung.setOnClickListener {

            val number = txtNumber.text.toString().toIntOrNull()


            if (number != null) {

                val result = if (number % 2 == 0) {
                    "Genap"
                } else {
                    "Ganjil"
                }

                txtHasil.text = "Hasil: $result"
            } else {

                txtHasil.text = "Input tidak valid"
            }
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}









