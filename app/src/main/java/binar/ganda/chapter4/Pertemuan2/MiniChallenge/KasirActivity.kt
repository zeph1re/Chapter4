package binar.ganda.chapter4.Pertemuan2.MiniChallenge

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import binar.ganda.chapter4.R
import kotlinx.android.synthetic.main.activity_kasir.*
import kotlinx.android.synthetic.main.custom_struk_dialog.view.*
import kotlinx.android.synthetic.main.fragment_kasir_dialog.total_belanja_tv

class KasirActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kasir)

        hitung_belanja_custom_btn.setOnClickListener {
            val namaBarang = et_nama_barang?.text.toString()
            val jumlahBarang = et_jumlah_barang?.text.toString().toInt()
            val hargaBarang = et_harga_barang?.text.toString().toInt()
            val totalBelanja = jumlahBarang * hargaBarang

            val view = LayoutInflater.from(this).inflate(R.layout.custom_struk_dialog,null, false)
            val customDialog = AlertDialog.Builder(this)
            customDialog.setView(view)
            val dialog = customDialog.create()

            view.total_belanja_tv.text = "Total Belanja = $totalBelanja"

            view.uang_bayar_btn.setOnClickListener {
                val uangBayar = view.et_uang_bayar.text.toString().toInt()
                val kembalian = uangBayar - totalBelanja

                result_tv.text = """
                    Barang: $namaBarang
                    Jumlah: $jumlahBarang
                    Harga: $hargaBarang
                    Total: $totalBelanja
                    Kembalian: $kembalian
                """.trimIndent()

                dialog.dismiss()
            }
            dialog.show()
        }

        hitung_belanja_fragment_btn.setOnClickListener {
            val dialog = KasirDialogFragment()
            dialog.show(supportFragmentManager, "dialog")




        }
    }
}