package binar.ganda.chapter4.Pertemuan1.MiniChallenge

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import binar.ganda.chapter4.R
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.fragment_first.*


class FirstFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        toast_btn.setOnClickListener {
            Toast.makeText(requireContext(),"this is Toast", Toast.LENGTH_LONG).show()
        }

        snackbar_btn.setOnClickListener {
            Snackbar.make(it, "Ini Snackbar", Snackbar.LENGTH_INDEFINITE)
                .setAction("Move") {
                    Navigation.findNavController(view).navigate(R.id.action_firstFragment_to_secondFragment)
                }.show()
        }
    }


}


