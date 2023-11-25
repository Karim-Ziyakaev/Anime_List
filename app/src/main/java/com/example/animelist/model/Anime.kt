package com.example.animelist.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Anime(
    @StringRes val titleRes: Int,
    @StringRes val descriptionRes: Int,
    @DrawableRes val imageRes: Int,
    val rating: Int
)
