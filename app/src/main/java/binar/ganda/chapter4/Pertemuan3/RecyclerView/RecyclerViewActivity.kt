package binar.ganda.chapter4.Pertemuan3.RecyclerView

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import binar.ganda.chapter4.R
import kotlinx.android.synthetic.main.activity_recycler_view.*

class RecyclerViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        val datamahasiswa = arrayListOf(
            Mahasiswa("Ganda", "1951"),
            Mahasiswa("Patra", "1952"),
            Mahasiswa("Greta", "1953"),
            Mahasiswa("Calvin", "1954"),
            Mahasiswa("Lilis", "1955"),
            Mahasiswa("Mumtaz", "1956")
        )


        val adapt = AdapterMahasiswa(datamahasiswa)
        val layManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false )

        recycle_view.layoutManager = layManager
        recycle_view.adapter = adapt
    }
}