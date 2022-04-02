package binar.ganda.chapter4.Pertemuan4.Tugas

import android.annotation.SuppressLint
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import binar.ganda.chapter4.R
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_shared_preferences_dua.logout_btn

class Home : AppCompatActivity() {

    private lateinit var shared : SharedPreferences

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        shared = getSharedPreferences("Tugas", Context.MODE_PRIVATE)
        val getUsername = shared.getString("USERNAME", "")
        shared.getString("PASSWORD", "")

        username_tv.text = "Hello, $getUsername"

        logout()

    }

    private fun logout() {
        logout_btn.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Logout")
                .setMessage("Yakin Logout")
                .setCancelable(true)
                .setPositiveButton("Ya") { _: DialogInterface, _: Int ->
                    val logoutsf = shared.edit()
                    logoutsf.clear()
                    logoutsf.apply()

                    startActivity(Intent(this, Login::class.java))
                    finish()
                }
                .setNegativeButton("Tidak") { _: DialogInterface, _: Int ->
                    Toast.makeText(this,"Gagal Logout, Coba sekali lagi", Toast.LENGTH_LONG).show()
                }
                .show()



        }


    }

}