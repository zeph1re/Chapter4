package binar.ganda.chapter4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import binar.ganda.chapter4.Pertemuan1.MiniChallenge.MainActivity
import binar.ganda.chapter4.Pertemuan2.Dialog.AlertDialogActivity
import binar.ganda.chapter4.Pertemuan2.MiniChallenge.KasirActivity
import binar.ganda.chapter4.Pertemuan3.Latihan.AplikasiActivity
import binar.ganda.chapter4.Pertemuan3.RecyclerView.RecyclerViewActivity
import binar.ganda.chapter4.Pertemuan4.Latihan.LatihanSF
import binar.ganda.chapter4.Pertemuan4.SharedPreferences.MainSharedPreferences
import binar.ganda.chapter4.Pertemuan4.Tugas.SplashScreen
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pertemuan_satu_btn.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        pertemuan_dua_btn.setOnClickListener {
            startActivity(Intent(this, AlertDialogActivity::class.java))
        }

        pertemuan_tiga_btn.setOnClickListener {
            startActivity(Intent(this, AplikasiActivity::class.java))
        }

        pertemuan_empat_btn.setOnClickListener {
            startActivity(Intent(this, SplashScreen::class.java))
        }
    }
}