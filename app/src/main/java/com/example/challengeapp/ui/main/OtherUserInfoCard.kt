package com.example.challengeapp.ui.main

import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.challengeapp.R
import com.example.challengeapp.ui.theme.Grey100
import com.example.challengeapp.ui.theme.Grey800
import com.example.challengeapp.ui.theme.Grey900
import com.example.challengeapp.util.CustomTextStyle
import com.example.challengeapp.util.getTextStyle

// 지목한 서퍼의 정보를 보여주는 컴포저블
@Composable
fun OtherUserInfoCard() {
    Card (
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Column (
            modifier = Modifier
                .background(Grey100)
            ,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 14.dp)
                ,
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row (
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(R.drawable.img_defaultuser),
                        contentDescription = null,
                        modifier = Modifier
                            .clip(CircleShape)
                            .size(24.dp),
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = "박정민",
                        style = getTextStyle(style = CustomTextStyle.H5).copy(color = Grey900)
                    )
                }
                Text(
                    text = "33번째 서퍼",
                    style = getTextStyle(style = CustomTextStyle.H6).copy(color = Grey800)
                )
            }
        }
    }
}