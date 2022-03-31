package binar.ganda.chapter4.Pertemuan2.MiniChallenge

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import binar.ganda.chapter4.R
import kotlinx.android.synthetic.main.activity_kasir.*
import kotlinx.android.synthetic.main.fragment_kasir_dialog.*
import kotlinx.android.synthetic.main.fragment_kasir_dialog.view.*


class KasirDialogFragment : DialogFragment() {

    @SuppressLint("SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view: View = inflater.inflate(R.layout.fragment_kasir_dialog, container, false)

        view.uang_bayar_btn.setOnClickListener {
            val namaBarang = activity?.findViewById<EditText>(R.id.et_nama_barang)?.text.toString()
            val jumlahBarang = activity?.findViewById<EditText>(R.id.et_jumlah_barang)?.text.toString().toInt()
            val hargaBarang = activity?.findViewById<EditText>(R.id.et_harga_barang)?.text.toString().toInt()
            val totalBelanja = jumlahBarang * hargaBarang
            total_belanja_tv.text = "Total Belanja = $totalBelanja"

            val uangBayar = view.findViewById<EditText>(R.id.et_uang_bayar).text.toString().toInt()
            val kembalian = uangBayar.minus(totalBelanja)

            result_tv.text = """
                Barang: $namaBarang
                Jumlah: $jumlahBarang
                Harga: $hargaBarang
                Total: $totalBelanja
                Kembalian: $kembalian
            """.trimIndent()

            dismiss()
        }
        return view
    }




}

