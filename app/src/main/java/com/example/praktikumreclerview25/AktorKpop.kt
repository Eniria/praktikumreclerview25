package com.example.praktikumreclerview25


import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class AktorKpop(
    var name: String,
    var deskripsi: String,
    var gambar: Int
) : Parcelable
