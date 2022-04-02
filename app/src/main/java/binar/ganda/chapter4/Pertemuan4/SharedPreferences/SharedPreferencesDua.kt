package binar.ganda.chapter4.Pertemuan4.SharedPreferences

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import binar.ganda.chapter4.R
import kotlinx.android.synthetic.main.activity_shared_preferences_dua.*

class SharedPreferencesDua : AppCompatActivity() {
    lateinit var sf: SharedPreferences

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shared_preferences_dua)


        sf = getSharedPreferences("contoh", Context.MODE_PRIVATE)
        val getnama = sf.getString("NAMA", "")
        val getpass = sf.getString("PASSWORD", "")

        getnama_sf.text = """
            $getnama
            $getpass
        """.trimIndent()

        logout_btn.setOnClickListener {
            logout()
        }
    }

    fun logout() {
        val logoutsf = sf.edit()
        logoutsf.clear()
        logoutsf.apply()

        startActivity(Intent(this, MainSharedPreferences::class.java))
        finish()
    }
}