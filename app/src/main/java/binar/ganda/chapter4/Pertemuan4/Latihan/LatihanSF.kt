package binar.ganda.chapter4.Pertemuan4.Latihan

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import binar.ganda.chapter4.Pertemuan4.SharedPreferences.SharedPreferencesDua
import binar.ganda.chapter4.R
import kotlinx.android.synthetic.main.activity_latihan_sf.*
import kotlinx.android.synthetic.main.activity_latihan_sf.et_nama
import kotlinx.android.synthetic.main.activity_main_shared_preferences.*
import kotlinx.android.synthetic.main.activity_shared_preferences_dua.*

class LatihanSF : AppCompatActivity() {

    lateinit var prefs: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan_sf)

        prefs = getSharedPreferences("latihan", Context.MODE_PRIVATE)
        save()
        view()
        clear()

    }




    @SuppressLint("SetTextI18n")
    fun save() {
        save_btn.setOnClickListener {
            val dataID = et_id.text.toString()
            val dataNama = et_nama.text.toString()
            val sf = prefs.edit()
            sf.putString("ID", dataID)
            sf.putString("NAMA", dataNama)
            sf.apply()

        }
    }

    @SuppressLint("SetTextI18n")
    private fun view() {
        view_btn.setOnClickListener {
            val dataID = et_id.text.toString()
            val dataNama = et_nama.text.toString()

            result_tv.text = """
            ID Anda     : $dataID
            Nama Anda   : $dataNama
        """.trimIndent()
        }
    }


    private fun clear() {
        clear_btn.setOnClickListener {
            val clearsf = prefs.edit()
            clearsf.clear()
            clearsf.apply()
        }
    }


}