package binar.ganda.chapter4.Pertemuan1.MiniChallenge

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import binar.ganda.chapter4.Pertemuan1.Toast.ToastActivity
import binar.ganda.chapter4.R
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        toast_btn.setOnClickListener {
            val nama = et_nama.text.toString()
            Toast.makeText(this,"Selamat Datang $nama", Toast.LENGTH_LONG).show()
        }

        snackbar_btn.setOnClickListener {
            val tombol = Snackbar.make(it, "Next Page?", Snackbar.LENGTH_INDEFINITE)
            tombol.setAction("Tampilkan") {
                val pindah = Intent(this, SecondActivity::class.java)
                startActivity(pindah)
            }.show()


        }
    }
}