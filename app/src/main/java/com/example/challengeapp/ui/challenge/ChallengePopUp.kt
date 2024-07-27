package com.example.challengeapp.ui.challenge

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.challengeapp.R
import com.example.challengeapp.ui.common.CommonButton
import com.example.challengeapp.ui.theme.Blue
import com.example.challengeapp.ui.theme.ChallengeAppTheme
import com.example.challengeapp.util.CustomTextStyle
import com.example.challengeapp.util.getTextStyle

@Composable
fun ChallengePopUp() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Transparent)
    ) {
        Card (
            modifier = Modifier
                .fillMaxWidth(0.9f)
                .background(color = Color.White)
                .clip(RectangleShape)
        ) {
            Box(modifier = Modifier.fillMaxWidth()) {
                Image(
                    painter = painterResource(id = R.drawable.img_popup),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxWidth()
                )
                Text(
                    text = "최서지 님, 오늘의 파도에\n함께해 보세요!",
                    style = getTextStyle(style = CustomTextStyle.H3).copy(color = Blue),
                    modifier = Modifier
                        .align(Alignment.TopCenter)
                        .padding(top = 50.dp),
                    textAlign = TextAlign.Center
                )
                Column (
                    modifier = Modifier.align(Alignment.BottomCenter).padding(horizontal = 20.dp)
                ) {
                    CommonButton(
                        modifier = Modifier,
                        buttonText = "파도타기 참여하기",
                        isChallengeReceived = true,
                        isChallengeDone = false
                    )
                    Spacer(modifier = Modifier.height(40.dp))
                }

            }
        }
    }

}

@Composable
@Preview
fun ChallengePopUpPreview() {
    ChallengeAppTheme {
        ChallengePopUp()
    }
}