package binar.ganda.chapter4.Pertemuan4.SharedPreferences

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import binar.ganda.chapter4.R
import kotlinx.android.synthetic.main.activity_main_shared_preferences.*

class MainSharedPreferences : AppCompatActivity() {

    //MEMBUAT VARIABLE GLOBAL
    lateinit var prefs: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_shared_preferences)

        if (getSharedPreferences("contoh", Context.MODE_PRIVATE).contains("contoh")){
            startActivity(Intent(this, SharedPreferencesDua::class.java))
            finish()
        }

        //INITIALIZE ISI DARI VARIABLE GLOBAL
        prefs = getSharedPreferences("contoh", Context.MODE_PRIVATE)
        SharedPrefExample()

    }

    fun SharedPrefExample() {
        proses_btn.setOnClickListener {
            val dataNama = et_nama.text.toString()
            val dataPasswd = et_password.text.toString()
            val sf = prefs.edit()
            sf.putString("NAMA", dataNama)
            sf.putString("PASSWORD", dataPasswd)
            sf.apply()

            startActivity(Intent(this, SharedPreferencesDua::class.java))
            finish()

        }
    }
}