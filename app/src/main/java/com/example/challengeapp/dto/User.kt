package com.example.challengeapp.dto

import android.media.Image
import androidx.annotation.DrawableRes
import com.example.challengeapp.R

data class User(
    val nickname: String,
    @DrawableRes val portrait: Int
)

val userList = listOf(
    User(nickname = "박정민", portrait = R.drawable.img_defaultuser),
    User(nickname = "손서우", portrait = R.drawable.img_defaultuser),
    User(nickname = "최서지", portrait = R.drawable.img_defaultuser)
)