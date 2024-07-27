package com.example.challengeapp.ui.common

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.challengeapp.ui.theme.Blue
import com.example.challengeapp.ui.theme.Grey800
import com.example.challengeapp.util.CustomTextStyle
import com.example.challengeapp.util.getTextStyle


// 메뉴의 소제목 컴포저블
@Composable
fun IconAndTitle(
    modifier: Modifier = Modifier,
    @DrawableRes icon: Int,
    title: String
) {
    Row (
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            painter = painterResource(id = icon),
            contentDescription = null,
            tint = Blue
        )
        Spacer(modifier = Modifier.width(4.dp))
        Text(
            text = title,
            style = getTextStyle(style = CustomTextStyle.H5).copy(color = Grey800)
        )
    }
}