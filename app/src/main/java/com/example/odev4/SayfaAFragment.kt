package com.example.odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.odev4.databinding.ActivityMainBinding
import com.example.odev4.databinding.FragmentAnasayfaBinding
import com.example.odev4.databinding.FragmentSayfaABinding


class SayfaAFragment : Fragment() {
    private lateinit var binding2: FragmentSayfaABinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding2 = FragmentSayfaABinding.inflate(inflater, container, false)

        binding2.button3.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.aToB)
        }

        return binding2.root
    }


}