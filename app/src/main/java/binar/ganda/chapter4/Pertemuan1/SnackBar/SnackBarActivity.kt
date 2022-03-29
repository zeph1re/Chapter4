package binar.ganda.chapter4.Pertemuan1.SnackBar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import binar.ganda.chapter4.R
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_snack_bar.*

class SnackBarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_snack_bar)

        snackbar_btn.setOnClickListener {
            Snackbar.make(it,"Ini Snack Bar Long", Snackbar.LENGTH_LONG).show()
        }


        snackbarsatu_btn.setOnClickListener {
            Snackbar.make(it, "Ini SnackBar", Snackbar.LENGTH_SHORT)
                .setAction("Tampilkan") {
                    Toast.makeText(this, "Toast dari Action Snackbar", Toast.LENGTH_LONG).show()
                }.show()
        }

        snackbardua_btn.setOnClickListener {
            val aa = Snackbar.make(it, "SnackBar Dua", Snackbar.LENGTH_INDEFINITE)
            aa.setAction("Dismiss") {
                aa.dismiss()
            }

            aa.show()
        }


    }
}