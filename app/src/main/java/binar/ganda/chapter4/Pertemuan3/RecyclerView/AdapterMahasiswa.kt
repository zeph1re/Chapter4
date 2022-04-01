package binar.ganda.chapter4.Pertemuan3.RecyclerView

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import binar.ganda.chapter4.R
import kotlinx.android.synthetic.main.activity_adapter.view.*

class AdapterMahasiswa(val listData: ArrayList<Mahasiswa>) : RecyclerView.Adapter<AdapterMahasiswa.ViewHolder>() {

    class ViewHolder(Layout: View): RecyclerView.ViewHolder(Layout){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterMahasiswa.ViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.activity_adapter, parent, false)
        return ViewHolder(layout)
    }

    override fun onBindViewHolder(holder: AdapterMahasiswa.ViewHolder, position: Int) {
        holder.itemView.nama_tv.text = listData[position].name
        holder.itemView.number_tv.text = listData[position].nim

    }

    override fun getItemCount(): Int {
        return listData.size
    }
}
