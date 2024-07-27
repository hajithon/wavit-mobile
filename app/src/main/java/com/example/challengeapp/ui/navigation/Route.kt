package com.example.challengeapp.ui.navigation

import androidx.annotation.DrawableRes
import com.example.challengeapp.R

sealed class BottomNavItem(
    val title: String,
    @DrawableRes val icon: Int,
    val screenRoute: String
) {
    object MainScreen: BottomNavItem("홈", R.drawable.ic_home, "MainScreen")
    object HistoryScreen: BottomNavItem("히스토리", R.drawable.ic_ship, "HistoryScreen")
    object FeedScreen: BottomNavItem("피드", R.drawable.ic_feed, "FeedScreen")
    object MyPageScreen: BottomNavItem("마이페이지", R.drawable.ic_user, "MyPageScreen")
}

sealed class Route(
    val title: String,
    val route: String
) {
    object ChallengeScreen: Route("챌린지 참여 스크린", "ChallengeScreen")
}