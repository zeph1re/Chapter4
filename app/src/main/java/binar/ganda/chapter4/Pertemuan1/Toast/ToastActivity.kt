package binar.ganda.chapter4.Pertemuan1.Toast

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import binar.ganda.chapter4.R
import kotlinx.android.synthetic.main.activity_toast.*


class ToastActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toast)

        toast_btn.setOnClickListener {
            val data = "qwertyu"
            Toast.makeText(this,"Ini Toast $data",Toast.LENGTH_LONG).show()
        }

    }
}