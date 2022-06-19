package com.example.odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.odev4.databinding.FragmentSayfaABinding
import com.example.odev4.databinding.FragmentSayfaYBinding


class SayfaYFragment : Fragment() {
    private lateinit var binding5: FragmentSayfaYBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding5 = FragmentSayfaYBinding.inflate(inflater, container, false)

        binding5.button6.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.yToAnasayfa)
        }
        return binding5.root
    }
}