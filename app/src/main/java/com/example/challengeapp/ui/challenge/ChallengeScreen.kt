package com.example.challengeapp.ui.challenge

import android.net.Uri
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import com.example.challengeapp.dto.User
import com.example.challengeapp.dto.userList
import com.example.challengeapp.ui.common.CommonButton
import com.example.challengeapp.ui.theme.ChallengeAppTheme
import com.example.challengeapp.ui.theme.Grey100
import com.example.challengeapp.ui.theme.Grey800
import com.example.challengeapp.ui.theme.White
import com.example.challengeapp.util.CustomTextStyle
import com.example.challengeapp.util.getTextStyle


data class ChallengeCompleteInfo (
    val user: User,
    val image: Uri,
    val message: String,
)

class TextViewModel: ViewModel() {
    private val _text = MutableLiveData("")
    val text: LiveData<String> = _text

    fun onTextChanged(newText: String) { _text.value = newText }
}

@Composable
fun ChallengeScreen() {
    Column (
        modifier = Modifier
            .background(color = White)
            .fillMaxSize()
            .padding(horizontal = 20.dp)
    ) {
        Row (
            modifier = Modifier.padding(vertical = 20.dp)
        ) {
            Icon(
                imageVector = Icons.Default.KeyboardArrowLeft,
                contentDescription = null
            )
            Text(
                text = "피드 인증하기",
                style = getTextStyle(style = CustomTextStyle.H5).copy(color = Color.Black)
            )
        }
        UploadMyFeed(
            currentUser = userList[1],
            onMakeFeed = { }
        )
    }
}

@Composable
fun UploadMyFeed(
    currentUser: User,
    textViewModel: TextViewModel = TextViewModel(),
    onMakeFeed: (ChallengeCompleteInfo) -> Unit
) {
    val myMessage by textViewModel.text.observeAsState("")
    val context = LocalContext.current

    Card (
        modifier = Modifier.height(410.dp),
        colors = CardDefaults.cardColors(Grey100)
    ) {
        Column (
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 14.dp)
            ,
        ) {
            GalleryImagePicker()
            Spacer(modifier = Modifier.height(14.dp))
            CustomTextBar(
                msg = myMessage,
                onMsgChanged = {textViewModel.onTextChanged(it)}
            )
            CommonButton(
                buttonText = "인증 완료하기",
                isChallengeReceived = true,
                isChallengeDone = false
            )
        }
    }
}

@Composable
fun CustomTextBar(
    modifier: Modifier = Modifier,
    msg: String,
    onMsgChanged: (String) -> Unit
) {
    OutlinedTextField(
        value = msg,
        onValueChange = onMsgChanged,
        textStyle = getTextStyle(style = CustomTextStyle.H7).copy(color = Grey800),
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.Transparent),
    )
}

@Preview
@Composable
fun ChallengeScreenPreview() {
    ChallengeAppTheme {
        ChallengeScreen()
    }
}

