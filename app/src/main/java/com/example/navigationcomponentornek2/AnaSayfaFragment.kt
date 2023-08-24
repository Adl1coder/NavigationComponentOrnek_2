package com.example.navigationcomponentornek2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationcomponentornek2.databinding.FragmentAnaSayfaBinding


class AnaSayfaFragment : Fragment() {

private lateinit var tasarim: FragmentAnaSayfaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        tasarim =FragmentAnaSayfaBinding.inflate(inflater,container,false)
        tasarim.buttonDetaySayfasiGecis.setOnClickListener {

            //veri gönderme: (Detay sayfasına gönderiyoruz)
            val gecis = AnaSayfaFragmentDirections.actionDetaySayfasiGecis( nesne = Kisiler(1,"sinem") ,"Ahmet", 45 ,"aslan" )
            Navigation.findNavController(it).navigate(gecis)
        }
        return tasarim.root
    }


}