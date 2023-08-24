package com.example.navigationcomponentornek2

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.example.navigationcomponentornek2.databinding.FragmentDetayBinding


class DetayFragment : Fragment() {
private lateinit var tasarim: FragmentDetayBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        tasarim=FragmentDetayBinding.inflate(inflater,container,false)


        tasarim.buttonCiktiSayfasiGecis.setOnClickListener {

            Navigation.findNavController(it).navigate(R.id.actionCiktiSayfasiGecis)
        }
        // oluşturduğumuz verileri almak için :
        val bundle: DetayFragmentArgs by navArgs()
        val gelenAd= bundle.ad
        val gelenYas= bundle.yas
        val gelensoyad= bundle.soyad
        val gelenNesne= bundle.nesne
        //Göstermek için log yöntemi kullandık(textview ile de görebilirdik):
         // logchat kısmında görebiliriz

        Log.d("deneme",gelenAd)
        Log.d("deneme",gelenYas.toString())
        Log.d("deneme",gelensoyad)
        Log.d("deneme",gelenNesne.kisiAd)
        Log.d("deneme",gelenNesne.kisiNo.toString())

        return tasarim.root


}
}