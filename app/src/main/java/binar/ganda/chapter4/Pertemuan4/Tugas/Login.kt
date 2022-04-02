package binar.ganda.chapter4.Pertemuan4.Tugas

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import binar.ganda.chapter4.Pertemuan4.SharedPreferences.SharedPreferencesDua
import binar.ganda.chapter4.R
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_main_shared_preferences.*
import kotlinx.android.synthetic.main.activity_main_shared_preferences.et_password

class Login : AppCompatActivity() {

    lateinit var shared : SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        shared = getSharedPreferences("Tugas", Context.MODE_PRIVATE)
        login()
    }

    fun login () {
        login_btn.setOnClickListener {
            val dataUsername = et_username.text.toString()
            val dataPasswd = et_password.text.toString()
            val sf = shared.edit()
            sf.putString("USERNAME", dataUsername)
            sf.putString("PASSWORD", dataPasswd)
            sf.apply()

            startActivity(Intent(this, Home::class.java))
            finish()

        }

    }
}