package binar.ganda.chapter4.Pertemuan3.Latihan

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import binar.ganda.chapter4.Pertemuan3.RecyclerView.Mahasiswa
import binar.ganda.chapter4.R
import kotlinx.android.synthetic.main.activity_adapter.view.*
import kotlinx.android.synthetic.main.activity_adapter.view.picture
import kotlinx.android.synthetic.main.activity_adapter_aplikasi.view.*

class AdapterAplikasi(val listAplikasi: ArrayList<Aplikasi>) : RecyclerView.Adapter<AdapterAplikasi.ViewHolder>() {

    class ViewHolder(Layout: View): RecyclerView.ViewHolder(Layout){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterAplikasi.ViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.activity_adapter_aplikasi, parent, false)
        return ViewHolder(layout)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: AdapterAplikasi.ViewHolder, position: Int) {
        holder.itemView.picture.setImageResource(listAplikasi[position].img)
        holder.itemView.appname_tv.text = listAplikasi[position].namaAPK
        holder.itemView.pit_tv.text = listAplikasi[position].pit
        holder.itemView.category_tv.text = listAplikasi[position].category
        holder.itemView.rating_tv.text = listAplikasi[position].rating.toString()
        holder.itemView.size_app_tv.text = listAplikasi[position].sizeapp.toString() + " MB"
        holder.itemView.jumlah_download_tv.text = listAplikasi[position].jumlahDownload.toString() + "M+"

    }

    override fun getItemCount(): Int {
        return listAplikasi.size
    }
}