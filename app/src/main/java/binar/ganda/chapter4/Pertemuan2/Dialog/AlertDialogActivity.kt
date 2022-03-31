package binar.ganda.chapter4.Pertemuan2.Dialog

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import binar.ganda.chapter4.Pertemuan2.MiniChallenge.KasirActivity
import binar.ganda.chapter4.R
import kotlinx.android.synthetic.main.activity_alert_dialog.*
import kotlinx.android.synthetic.main.activity_alert_dialog.view.*
import kotlinx.android.synthetic.main.custom_dialog.*
import kotlinx.android.synthetic.main.custom_dialog.view.*
import kotlinx.android.synthetic.main.fragment_alert_dialog.view.*

class AlertDialogActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert_dialog)

        alert_satu.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Title Example")
                .setMessage("Contoh Pesan")
                .setCancelable(true)
                .setIcon(R.drawable.ic_launcher_background)
                .show()
        }

        alert_dua.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Hapus Data")
                .setMessage("Yakin Hapus Data?")
                .setCancelable(true)
                .setPositiveButton("Ya") { dialogInterface: DialogInterface, i : Int ->

                    Toast.makeText(this,"Data Anda Terhapus", Toast.LENGTH_LONG).show()
                }
                .setNegativeButton("Tidak") { dialogInterface: DialogInterface, i : Int ->
                    Toast.makeText(this,"Data Anda Gagal terhapus", Toast.LENGTH_LONG).show()
                }
                .show()
        }

        alert_tiga.setOnClickListener {
            val a = AlertDialog.Builder(this)
            val b = a.create()
                a.setTitle("Example Dismiss")
                a.setMessage("Dismiss?")
                a.setCancelable(true)
                a.setPositiveButton("Ya") { dialogInterface: DialogInterface, i : Int ->

                    Toast.makeText(this,"Data Anda Terhapus", Toast.LENGTH_LONG).show()
                }
                a.setNegativeButton("Tidak") { dialogInterface: DialogInterface, i : Int ->
                    Toast.makeText(this,"Data Anda Gagal terhapus", Toast.LENGTH_LONG).show()
                }
                a.setNeutralButton("Dismiss") { dialogInterface: DialogInterface, i : Int ->
                    b.dismiss()
                }
                a.show()
        }

        alert_empat.setOnClickListener {
            val view = LayoutInflater.from(this).inflate(R.layout.custom_dialog,null, false)
            val customDialog = AlertDialog.Builder(this)
                customDialog.setView(view)
            val dialog = customDialog.create()

            view.custom_dialog_btn.setOnClickListener {
                val nama = view.et_nama.text.toString()
                Toast.makeText(this,"$nama", Toast.LENGTH_LONG).show()
                dialog.dismiss()
            }
            dialog.show()
        }

        alert_lima.setOnClickListener {
            AlertDialogFragment().show(supportFragmentManager, "abc")
        }

        mini_challenge_btn.setOnClickListener {
            startActivity(Intent(this, KasirActivity::class.java))
        }


    }
}




