package com.example.challengeapp.util

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.example.challengeapp.ui.theme.Pretendard

enum class CustomTextStyle {
    H1,
    H2,
    H3,
    H4,
    H5,
    H6,
    H7
}

@Composable
fun getTextStyle(style: CustomTextStyle): TextStyle {
    return when (style) {
        // todo: 다 만들고 나서 프리텐다드 글꼴로 변경하기
        CustomTextStyle.H1 -> {
            TextStyle(
                fontSize = 23.sp,
                fontFamily = FontFamily.SansSerif, //Pretendard
                fontWeight = FontWeight.Bold,
            )
        }
        CustomTextStyle.H2 -> {
            TextStyle(
                fontSize = 21.sp,
                fontFamily = FontFamily.SansSerif,//Pretendard,
                fontWeight = FontWeight.SemiBold,
            )
        }
        CustomTextStyle.H3 -> {
            TextStyle(
                fontSize = 19.sp,
                fontFamily = FontFamily.SansSerif,//Pretendard,
                fontWeight = FontWeight.Bold,
            )
        }
        CustomTextStyle.H4 -> {
            TextStyle(
                fontSize = 17.sp,
                fontFamily = FontFamily.SansSerif,//Pretendard,
                fontWeight = FontWeight.SemiBold,
            )
        }
        CustomTextStyle.H5 -> {
            TextStyle(
                fontSize = 15.sp,
                fontFamily = FontFamily.SansSerif,//Pretendard,
                fontWeight = FontWeight.SemiBold,
            )
        }
        CustomTextStyle.H6 -> {
            TextStyle(
                fontSize = 13.sp,
                fontFamily = FontFamily.SansSerif,//Pretendard,
                fontWeight = FontWeight.Normal,
            )
        }
        CustomTextStyle.H7 -> {
            TextStyle(
                fontSize = 12.sp,
                fontFamily = FontFamily.SansSerif,//Pretendard,
                fontWeight = FontWeight.Normal,
            )
        }
    }
}

