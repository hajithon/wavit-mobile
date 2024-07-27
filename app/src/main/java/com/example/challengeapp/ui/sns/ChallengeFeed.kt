package com.example.challengeapp.ui.sns

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.challengeapp.R
import com.example.challengeapp.ui.theme.Grey100
import com.example.challengeapp.ui.theme.Grey800
import com.example.challengeapp.util.CustomTextStyle
import com.example.challengeapp.util.getTextStyle

@Composable
fun ChallengeFeed(
    modifier: Modifier = Modifier
) {
    Card (
        modifier = modifier.height(410.dp),
        colors = CardDefaults.cardColors(Grey100)
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth(1f),
            contentScale = ContentScale.Crop
        )
        Column (
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 14.dp)
            ,
        ) {
            Row (
                modifier = Modifier.fillMaxWidth(),
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
                            .size(24.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = "박빠찌",
                        style = getTextStyle(style = CustomTextStyle.H5).copy(color = Grey800)
                    )
                }
                Text(
                    text = "7월 25일 오후 9시 10분",
                    style = getTextStyle(style = CustomTextStyle.H7).copy(color = Grey800)
                )
            }
            Spacer(modifier = Modifier.height(14.dp))
            Text(
                text = "텀블러를 가지고 왔음!",
                style = getTextStyle(style = CustomTextStyle.H7).copy(color = Grey800)
            )
        }
    }
}
