package com.pandecode.manutdprofile.model

import com.pandecode.manutdprofile.R

enum class Position(val position: String, val icon: Int) {
    GOALKEEPER("Goalkeeper", R.drawable.ic_goalkeeper),
    DEFENDER("Defender", R.drawable.ic_defender),
    MIDFIELDER("Midfielder", R.drawable.ic_midfielder),
    FORWARD("Forward", R.drawable.ic_forward)
}