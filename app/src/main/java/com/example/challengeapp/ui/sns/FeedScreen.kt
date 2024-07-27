package com.example.challengeapp.ui.sns

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp

@Composable
fun FeedScreen() {
    LazyColumn (
        contentPadding = PaddingValues(0.dp)
    ) {
        item(5) {
            ChallengeFeed()
        }
    }
}