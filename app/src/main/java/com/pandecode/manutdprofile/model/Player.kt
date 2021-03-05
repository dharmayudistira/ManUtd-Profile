package com.pandecode.manutdprofile.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Player(
    var photo: Int = 0,
    var backdropPhoto: Int = 0,
    var name: String = "",
    var backNumber: String = "",
    var positionName: String = "",
    var positionIcon: Int = 0,
    var dateOfBirth: String = "",
    var dateOfJoin: String = "",
    var countryName: String = "",
    var countryIcon: Int = 0,
    var biography: String = "",
    var isFavorite: Boolean = false
) : Parcelable
