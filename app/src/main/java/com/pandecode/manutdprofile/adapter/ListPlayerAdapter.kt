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

class ListPlayerAdapter : RecyclerView.Adapter<ListPlayerAdapter.ViewHolder>() {

    private val players = ArrayList<Player>()

    fun setPlayers(listPlayer: List<Player>) {
        players.clear()
        players.addAll(listPlayer)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ListPlayerAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_player_list, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListPlayerAdapter.ViewHolder, position: Int) {
        holder.bind(players[position])
    }

    override fun getItemCount(): Int = players.size

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val tvName: TextView = itemView.findViewById(R.id.tv_item_name_list)
        private val tvPosition: TextView = itemView.findViewById(R.id.tv_item_position_list)
        private val tvBackNumber: TextView = itemView.findViewById(R.id.tv_item_backnumber_list)
        private val imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo_list)

        fun bind(player: Player) {
            with(itemView) {
                tvName.text = player.name
                tvPosition.text = player.positionName
                tvBackNumber.text = player.backNumber

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