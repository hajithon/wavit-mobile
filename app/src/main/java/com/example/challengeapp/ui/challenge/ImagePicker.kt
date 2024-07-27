package com.example.challengeapp.ui.challenge

import android.net.Uri
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.challengeapp.ui.theme.Grey500

@Composable
fun GalleryImagePicker() {
    // Context
    val context = LocalContext.current

    // Image URI state
    var imageUri by remember { mutableStateOf<Uri?>(null) }

    // Create an ActivityResultLauncher for picking images
    val launcher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.GetContent(),
        onResult = { uri: Uri? ->
            imageUri = uri
        }
    )

    Box (
        modifier = Modifier.size(320.dp),
        contentAlignment = Alignment.Center
    ) {
        IconButton(onClick = { launcher.launch("image/*") }) {
            Icon(
                imageVector = Icons.Default.Add,
                contentDescription = null,
                modifier = Modifier
                    .scale(2f)
                    .align(Alignment.Center),
                tint = Grey500
            )
        }

        imageUri?.let {
            AsyncImage(
                model = it,
                contentDescription = "Selected Image",
                modifier = Modifier
                    .fillMaxWidth(),
                contentScale = ContentScale.Crop
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewGalleryImagePicker() {
    GalleryImagePicker()
}