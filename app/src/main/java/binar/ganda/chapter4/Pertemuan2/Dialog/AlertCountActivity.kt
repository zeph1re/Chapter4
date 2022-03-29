package binar.ganda.chapter4.Pertemuan2.Dialog

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import binar.ganda.chapter4.R
import kotlinx.android.synthetic.main.activity_alert_count.*

class AlertCountActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert_count)

        count_btn.setOnClickListener {
            val angka1 = et_angka1.text.toString().toInt()
            val angka2 = et_angka2.text.toString().toInt()
            val result = angka1 - angka2

            val a = AlertDialog.Builder(this)
            val b = a.create()
            a.setTitle("Hasil Perhitungan")
            a.setMessage("Hasil dari $angka1 - $angka2 = $result")
            a.setCancelable(true)
            a.setIcon(R.drawable.ic_launcher_foreground)
            a.setNeutralButton("Dismiss") { dialogInterface: DialogInterface, i : Int ->
                b.dismiss()
            }
            a.show()
        }

        standard_alert_btn.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Latihan")
                .setMessage("Contoh Pesan")
                .setCancelable(true)
                .setIcon(R.drawable.ic_launcher_background)
                .show()
        }
    }
}