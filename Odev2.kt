package com.example.kotlinbootcampodev2

class Odev2 {

    //soru 1
    fun kilometreyiMileCevir(km: Double): Double {
        if (km > 0) {
            return km * 0.621
        } else {
            return 0.0
        }
    }

    //soru 2
    fun dikdortgeninAlaniniHesapla(kenar1: Int, kenar2: Int) {
        if (kenar1 > 0 && kenar2 > 0) {
            println("Dikdörtgenin alanı : ${kenar1 * kenar2}")
        } else {
            println("Lütfen pozitif değer giriniz.")
        }
    }

    //soru 3
    fun faktoriyelHesapla(sayi: Int): Int {
        if (sayi > 0) {
            var faktoriyel = 1
            for (i in sayi downTo 1) {
                faktoriyel *= i
            }
            return faktoriyel
        } else {
            return 0
        }
    }

    //soru 4
    fun kacAdetEHarfiVar(kelime: String) {
        var count = 0
        kelime.onEach {
            if (it == 'e') {
                count++
            }
        }
        println("$kelime kelimesinin içinde $count adet e harfi vardır.")
    }

    //soru 5
    fun icAciHesapla(kenarSayisi: Int): Int {
        if (kenarSayisi > 2) {
            return (kenarSayisi - 2) * 180
        } else {
            return 0
        }
    }

    //soru 6
    fun maasHesapla(gun: Int): Int {
        var maas = 0
        var mesai = 0
        if (gun * 8 > 150) {
            mesai = ((gun * 8) - 150) * 80
            maas = 150 * 40 + mesai
        } else if (gun * 8 in 1..149){
            maas = gun * 8 * 40
        } else {
            maas = 0
        }
        return maas
    }

    //soru 7
    fun otoparkUcretiHesapla(sure: Int): Int {
        var otoparkUcreti = 0
        if (sure == 1) {
            otoparkUcreti = 50
        } else if (sure > 1) {
            otoparkUcreti = ((sure - 1) * 10) + 50
        } else {
            otoparkUcreti = 0
        }
        return otoparkUcreti
    }
}