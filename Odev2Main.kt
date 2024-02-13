package com.example.kotlinbootcampodev2

fun main() {
    val odev2 = Odev2()

    //soru 1
    val km = 50.0
    val mil = odev2.kilometreyiMileCevir(km)
    println("$km KM $mil mil'dir.")

    //soru 2
    odev2.dikdortgeninAlaniniHesapla(5, 10)

    //soru 3
    val sayi = 5
    val faktoriyelSonuc = odev2.faktoriyelHesapla(sayi)
    println("$sayi faktoriyelin sonucu : $faktoriyelSonuc")

    //soru 4
    val kelime = "Techcareer"
    odev2.kacAdetEHarfiVar(kelime)

    //soru 5
    val kenarSayisi = 3
    val icAci = odev2.icAciHesapla(kenarSayisi)
    println("İç açı sonucu : $icAci")

    //soru 6
    val gun = 25
    val maas = odev2.maasHesapla(gun)
    println("$gun gün maaş sonucu : $maas")

    //soru 7
    val sure = 5
    val otoparkUcreti = odev2.otoparkUcretiHesapla(sure)
    println("$sure saatlik otopark ücreti : $otoparkUcreti")
}