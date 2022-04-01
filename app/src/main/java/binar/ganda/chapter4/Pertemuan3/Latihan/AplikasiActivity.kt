package binar.ganda.chapter4.Pertemuan3.Latihan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import binar.ganda.chapter4.R
import kotlinx.android.synthetic.main.activity_recycler_view.*

class AplikasiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aplikasi)

        val dataAplikasi = arrayListOf(
            Aplikasi(
                R.drawable.ic_baseline_settings_applications_24,
                "Binar Academy",
                "Binar Academy",
                "Education",
                4.6,
                13,
                16
            ),
            Aplikasi(
                R.drawable.ic_baseline_settings_applications_24,
                "Binar X",
                "Binar Academy",
                "Education",
                5.0,
                29,
                177
            ),

            Aplikasi(
                R.drawable.ic_baseline_settings_applications_24,
                "Binary Code Translator",
                "Binar Academy",
                "Education",
                3.8,
                16,
                180
            ),

            Aplikasi(
                R.drawable.ic_baseline_settings_applications_24,
                "Mobile Legends",
                "Chinese",
                "Game",
                4.7,
                200,
                180
            )



        )


        val adapt = AdapterAplikasi(dataAplikasi)
        val layManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false )

        recycle_view.layoutManager = layManager
        recycle_view.adapter = adapt
    }
}