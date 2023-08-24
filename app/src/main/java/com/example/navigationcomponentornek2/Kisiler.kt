package com.example.navigationcomponentornek2

import java.io.Serializable
//Veri transferi işlemi için serizable eklememiz gerekir.
data class Kisiler (var kisiNo: Int, var kisiAd:String):Serializable{
}