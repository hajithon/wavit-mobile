package com.example.challengeapp.ui.sns

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.challengeapp.ui.theme.ChallengeAppTheme

data class Feed (
    @DrawableRes val image: Int,
    val name: String,
    @DrawableRes val portrait: Int,
    val time: String,
)

@Composable
fun FeedScreen() {
    LazyColumn (
        modifier = Modifier.fillMaxSize().padding(horizontal = 20.dp),
        userScrollEnabled = true
    ) {
        item(5) {
            ChallengeFeed(Modifier.padding(bottom = 15.dp))
            ChallengeFeed(Modifier.padding(bottom = 15.dp))
            ChallengeFeed(Modifier.padding(bottom = 15.dp))
            ChallengeFeed(Modifier.padding(bottom = 15.dp))
            ChallengeFeed(Modifier.padding(bottom = 15.dp))
            ChallengeFeed(Modifier.padding(bottom = 15.dp))
        }
    }
}

@Composable
@Preview
fun FeedScreenPreview() {
    ChallengeAppTheme {
        FeedScreen()
    }
}