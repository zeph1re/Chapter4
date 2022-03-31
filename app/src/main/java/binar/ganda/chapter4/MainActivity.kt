package binar.ganda.chapter4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import binar.ganda.chapter4.Pertemuan1.MiniChallenge.MainActivity
import binar.ganda.chapter4.Pertemuan2.Dialog.AlertDialogActivity
import binar.ganda.chapter4.Pertemuan2.MiniChallenge.KasirActivity
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

    }
}