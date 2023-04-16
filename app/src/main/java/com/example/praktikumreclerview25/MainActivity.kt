package com.example.praktikumreclerview25

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.praktikumreclerview25.AktorKpop

class MainActivity : AppCompatActivity() {
    private lateinit var rvAktorKpop: RecyclerView
    private val list = ArrayList<AktorKpop>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rvAktorKpop = findViewById(R.id.rv_aktor_kpop)
        rvAktorKpop.setHasFixedSize(true)
        list.addAll(listAktorKpop)
        tampilkanRecyclerView()
    }

    private val listAktorKpop: ArrayList<AktorKpop>
        get() {
            val dataName = resources.getStringArray(R.array.data_nama_aktor)
            val dataDeskripsi = resources.getStringArray(R.array.data_deskripsi_aktor)
            val dataGambar = resources.obtainTypedArray(R.array.data_gambar_aktor)
            val listAktor = ArrayList<AktorKpop>()
            for (i in dataName.indices) {
                val aktor = AktorKpop(
                    dataName[i],
                    dataDeskripsi[i],
                    dataGambar.getResourceId(i, -1)
                )
                listAktor.add(aktor)
            }
            return listAktor
        }

    private fun tampilkanRecyclerView() {
        rvAktorKpop.layoutManager = LinearLayoutManager(this)
        val aktorKpopAdapter = AktorKpopAdapter(list)
        rvAktorKpop.adapter = aktorKpopAdapter
    }
}