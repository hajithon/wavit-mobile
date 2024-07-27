package com.example.challengeapp.ui.history

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.challengeapp.R
import com.example.challengeapp.ui.common.IconAndTitle
import com.example.challengeapp.ui.theme.ChallengeAppTheme
import com.example.challengeapp.ui.theme.Grey100
import com.example.challengeapp.ui.theme.Grey500
import com.example.challengeapp.ui.theme.Grey700
import com.example.challengeapp.ui.theme.Grey900
import com.example.challengeapp.ui.theme.LightBlue
import com.example.challengeapp.ui.theme.White
import com.example.challengeapp.util.CustomTextStyle
import com.example.challengeapp.util.getTextStyle

@Composable
fun HistoryScreen(
    isChallengeDone: Boolean = true
) {
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(White)
    ) {
        Box(
            contentAlignment = Alignment.BottomEnd,
            modifier = Modifier.clip(RectangleShape)
        ) {
            Image(
                painter = painterResource(id = R.drawable.img_historybg),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxWidth()
            )
            if (isChallengeDone) {
                Card (
                    modifier = Modifier
                        .fillMaxWidth(0.9f)
                        .align(Alignment.TopCenter)
                        .padding(top = 30.dp)
                    ,
                    colors = CardDefaults.cardColors( White.copy(alpha = 0.7f) ),
                    border = BorderStroke(width = 1.dp, color = LightBlue.copy(alpha = 0.3f))
                ) {
                    Row (
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(20.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = "오늘의 파도타기",
                            style = getTextStyle(style = CustomTextStyle.H5).copy(color = Grey500)
                        )
                        Text(
                            text = "7m",
                            style = getTextStyle(style = CustomTextStyle.H4).copy(color = Grey900)
                        )
                    }
                }
            }
        }
        Column (
            modifier = Modifier.padding(20.dp)
        ) {
            Spacer(modifier = Modifier.height(35.dp))
            IconAndTitle(icon = R.drawable.ic_graph, title = "오늘의 파도 리포트")
            Spacer(modifier = Modifier.height(20.dp))
            HistoryReportCard(title = "전체 파도 크기", msg = "24m")
            Spacer(modifier = Modifier.height(10.dp))
            HistoryReportCard(title = "인증 완료한 서퍼 수", msg = "241명")
            Spacer(modifier = Modifier.height(10.dp))
            HistoryReportCard(title = "인증하고 있는 서퍼 수", msg = "32명")
        }
    }

}

@Composable
fun HistoryReportCard(
    title: String,
    msg: String
) {
    Card (
        modifier = Modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(Grey100)
    ) {
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp, vertical = 12.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = title, style = getTextStyle(style = CustomTextStyle.H7).copy(color = Grey700))
            Text(text = msg, style = getTextStyle(style = CustomTextStyle.H7).copy(color = Grey700))
        }
    }
}




@Preview
@Composable
fun HistoryScreenPreview() {
    ChallengeAppTheme {
        HistoryScreen()
    }
}