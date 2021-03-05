package com.pandecode.manutdprofile.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.flaviofaria.kenburnsview.KenBurnsView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.pandecode.manutdprofile.R
import com.pandecode.manutdprofile.model.Player

class DetailFragment : Fragment() {
    private lateinit var imgBackdrop: KenBurnsView
    private lateinit var imgPosition: ImageView
    private lateinit var imgCountry: ImageView
    private lateinit var fabFavorite: FloatingActionButton

    private lateinit var tvPosition: TextView
    private lateinit var tvCountry: TextView
    private lateinit var tvBackNumber: TextView
    private lateinit var tvName: TextView
    private lateinit var tvJoinDate: TextView
    private lateinit var tvBirthDate: TextView
    private lateinit var tvBiography: TextView

    private val args: DetailFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val selectedPlayer = args.selectedPlayer

        setupUI()
        populateUI(selectedPlayer)
        favoriteState(selectedPlayer.isFavorite)

        fabFavorite.setOnClickListener {
            selectedPlayer.isFavorite = !selectedPlayer.isFavorite
            favoriteState(selectedPlayer.isFavorite)
        }

    }

    private fun populateUI(selectedPlayer: Player) {
        view?.context?.let { context ->
            Glide.with(context)
                .load(selectedPlayer.backdropPhoto)
                .into(imgBackdrop)

            Glide.with(context)
                .load(selectedPlayer.positionIcon)
                .into(imgPosition)

            Glide.with(context)
                .load(selectedPlayer.countryIcon)
                .into(imgCountry)
        }

        tvName.text = selectedPlayer.name
        tvJoinDate.text = selectedPlayer.dateOfJoin
        tvBirthDate.text = selectedPlayer.dateOfBirth
        tvBiography.text = selectedPlayer.biography
        tvPosition.text = selectedPlayer.positionName
        tvBackNumber.text = selectedPlayer.backNumber
        tvCountry.text = selectedPlayer.countryName
    }

    private fun setupUI() {
        imgBackdrop = view?.findViewById(R.id.img_player_backdrop_detail)!!
        imgPosition = view?.findViewById(R.id.img_player_position_detail)!!
        imgCountry = view?.findViewById(R.id.img_player_country_detail)!!

        tvPosition = view?.findViewById(R.id.tv_player_position_detail)!!
        tvCountry = view?.findViewById(R.id.tv_player_country_detail)!!
        tvBackNumber = view?.findViewById(R.id.tv_player_backnumber_detail)!!
        tvName = view?.findViewById(R.id.tv_player_name_detail)!!
        tvJoinDate = view?.findViewById(R.id.tv_player_joindate_detail)!!
        tvBirthDate = view?.findViewById(R.id.tv_player_birthdate_detail)!!
        tvBiography = view?.findViewById(R.id.tv_player_biography_detail)!!

        fabFavorite = view?.findViewById(R.id.fab_favorite_detail)!!
    }

    private fun favoriteState(state: Boolean) {
        context?.let { it ->
            if (state) {
                fabFavorite.setImageDrawable(ContextCompat.getDrawable(it, R.drawable.ic_favorite_on))
            }else {
                fabFavorite.setImageDrawable(ContextCompat.getDrawable(it, R.drawable.ic_favorite_off))
            }
        }

    }
}