package com.example.challengeapp.ui.topbar

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.challengeapp.R
import com.example.challengeapp.ui.theme.ChallengeAppTheme

@Composable
fun TopBar() {
    Column (
        modifier = Modifier.fillMaxWidth(),
    ) {
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp)
            ,
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(R.drawable.ic_wavitlogo),
                contentDescription = null
            )
            UserIcon(

            )
        }
    }
}

@Composable
fun UserIcon() {
    Image(
        painter = painterResource(R.drawable.img_defaultuser),
        contentDescription = null,
        modifier = Modifier
            .clip(CircleShape)
            .size(28.dp)
    )
}

@Composable
@Preview(showBackground = true)
fun TopBarPreview() {
    ChallengeAppTheme {
        TopBar()
    }
}