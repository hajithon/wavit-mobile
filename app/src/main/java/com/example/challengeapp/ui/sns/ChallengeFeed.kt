package com.example.challengeapp.ui.sns

import androidx.annotation.DrawableRes
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
import androidx.compose.ui.graphics.RectangleShape
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
    modifier: Modifier = Modifier,
    feedInfo: FeedInfo
) {
    Card (
        modifier = modifier.height(410.dp),
        colors = CardDefaults.cardColors(Grey100)
    ) {
        Image(
            painter = painterResource(id = feedInfo.img),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth(1f)
                .height(320.dp),
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
                        text = feedInfo.nickname,
                        style = getTextStyle(style = CustomTextStyle.H5).copy(color = Grey800)
                    )
                }
                Text(
                    text = feedInfo.time,
                    style = getTextStyle(style = CustomTextStyle.H7).copy(color = Grey800)
                )
            }
            Spacer(modifier = Modifier.height(14.dp))
            Text(
                text = feedInfo.comment,
                style = getTextStyle(style = CustomTextStyle.H7).copy(color = Grey800)
            )
        }
    }
}

data class FeedInfo(
    val nickname: String,
    val time: String,
    @DrawableRes val img: Int,
    val comment: String
)

val feedList = listOf(
    FeedInfo(
        nickname = "박정민",
        time = "7월 27일 오후 9시 10분",
        img = R.drawable.img_tumblr,
        comment = "텀블러를 가지고 왔음!"
    ),
    FeedInfo(
        nickname = "손서우",
        time = "7월 27일 오후 10시 24분",
        img = R.drawable.img_stair,
        comment = "계단을 이용했다"
    ),
    FeedInfo(
        nickname = "최선우",
        time = "7월 28일 오전 12시 30분",
        img = R.drawable.img_airconditioning,
        comment = "에어컨은 적정온도로 맞춰놓아도 시원해요"
    ),
    FeedInfo(
        nickname = "최서지",
        time = "7월 28일 오전 2시 9분",
        img = R.drawable.img_trashbin,
        comment = "분리수거를 철저히 해야 해요"
    ),
    FeedInfo(
        nickname = "",
        time = "",
        img = R.drawable.ic_feed,
        comment = ""
    )
)