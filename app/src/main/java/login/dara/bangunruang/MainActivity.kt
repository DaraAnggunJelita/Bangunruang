package login.dara.bangunruang

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var btnsuhu : Button
    private lateinit var btnbangunruang:Button
    private lateinit var btnganjil:Button
    private lateinit var btnbelanja:Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        btnganjil=findViewById(R.id.btnganjil)
        btnbelanja=findViewById(R.id.btnbelanja)
        btnbangunruang=findViewById(R.id.btnbangunruang)
        btnsuhu=findViewById(R.id.btnsuhu)

        btnsuhu.setOnClickListener(){
            Toast.makeText(this,"Menghitung Suhu" , Toast.LENGTH_SHORT).show()
            val intent = Intent(this, KonversiCelcius::class.java)
            startActivity(intent)
        }
        btnbangunruang.setOnClickListener(){
            Toast.makeText(this,"Menghitung Bangun Ruang" , Toast.LENGTH_SHORT).show()
            val intent = Intent(this,BangunRuang::class.java)
            startActivity(intent)
        }
        btnganjil.setOnClickListener(){
            Toast.makeText(this,"Menentukan Bilangan Genap Atau Ganjil" , Toast.LENGTH_SHORT).show()
            val intent = Intent(this,bilanganganjilgenap::class.java)
            startActivity(intent)
        }
        btnbelanja.setOnClickListener(){
            Toast.makeText(this,"Menghitung Diskon Belanja" , Toast.LENGTH_SHORT).show()
            val intent = Intent(this, DiskonBelanja::class.java)
            startActivity(intent)
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}