package com.example.praktikumreclerview25

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AktorKpopAdapter(
    private val listTeam: ArrayList<AktorKpop>
) : RecyclerView.Adapter<TeamViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TeamViewHolder {
        val itemView: View = LayoutInflater.from(parent.context).inflate(
            R.layout.item_aktor_kpop,
            parent,
            false
        )
        return TeamViewHolder(itemView)
    }
    override fun onBindViewHolder(holder: TeamViewHolder, position: Int) {
        holder.bind(listTeam[position])
    }
    override fun getItemCount(): Int {
        return listTeam.size
    }
}

class TeamViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var tvNamaTeam: TextView = itemView.findViewById(R.id.tv_nama_aktor)
    var tvDeskripTeam: TextView = itemView.findViewById(R.id.tv_deskripsi_aktor)
    var ivGambarTeam: ImageView = itemView.findViewById(R.id.iv_gambar_aktor)
    fun bind(team: AktorKpop) {
        tvNamaTeam.text = team.name
        tvDeskripTeam.text = team.deskripsi
        ivGambarTeam.setImageResource(team.gambar)
    }
}