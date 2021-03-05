package com.pandecode.manutdprofile.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.pandecode.manutdprofile.R
import com.pandecode.manutdprofile.model.Player
import com.pandecode.manutdprofile.ui.HomeFragmentDirections

class GridPlayerAdapter : RecyclerView.Adapter<GridPlayerAdapter.ViewHolder>() {

    private val players = ArrayList<Player>()

    fun setPlayers(listPlayer: List<Player>) {
        players.clear()
        players.addAll(listPlayer)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): GridPlayerAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_player_grid, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: GridPlayerAdapter.ViewHolder, position: Int) {
        holder.bind(players[position])
    }

    override fun getItemCount(): Int = players.size

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val tvPlayerName: TextView = itemView.findViewById(R.id.tv_item_name_grid)
        private val imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo_grid)

        fun bind(player: Player) {
            with(itemView) {

                tvPlayerName.text = player.name

                Glide.with(this)
                    .load(player.photo)
                    .into(imgPhoto)

                itemView.setOnClickListener {
                    val action = HomeFragmentDirections.actionHomeFragmentToDetailFragment(player)
                    findNavController().navigate(action)
                }
            }
        }
    }
}