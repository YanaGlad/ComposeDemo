package com.example.composedemo.screens.compose.menu

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.widget.Toast
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.composedemo.Navigation
import com.example.composedemo.R

@Composable
fun ContactMenu(navController: NavController) {
    BackHandler {
        navController.navigate(Navigation.MENU)
    }

    val context = LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .verticalScroll(rememberScrollState()),
    ) {
        Text(
            modifier = Modifier.fillMaxWidth(),
            text = "Разработчик приложения",
            textAlign = TextAlign.Center,
            fontSize = 25.sp,
        )
        Text(
            modifier = Modifier.fillMaxWidth(),
            text = "Yana Glad",
            textAlign = TextAlign.Center,
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold,
        )

        Image(
            bitmap = ImageBitmap.imageResource(R.drawable.y_glad),
            modifier = Modifier
                .fillMaxWidth()
                .align(CenterHorizontally),
            contentDescription = "Y",
        )


        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(top = 20.dp)) {

            val intentVk = remember { Intent(Intent.ACTION_VIEW, Uri.parse(Y_VK)) }

            Image(
                imageVector = ImageVector.vectorResource(R.drawable.vk),
                modifier = Modifier
                    .width(50.dp)
                    .height(50.dp)
                    .weight(1f)
                    .clickable(
                        enabled = true,
                        onClick = {
                            context.startActivity(intentVk)
                        }
                    ),
                contentDescription = "VK Y",
            )

            Image(
                imageVector = ImageVector.vectorResource(R.drawable.ic_message),
                modifier = Modifier
                    .width(50.dp)
                    .height(50.dp)
                    .weight(1f)
                    .clickable(
                        enabled = true,
                        onClick = {
                            copyToClipBoard(context, Y_MAIL)
                        }
                    ),
                contentDescription = "Mail Y",
            )

            val intentGit = remember { Intent(Intent.ACTION_VIEW, Uri.parse(Y_GIT)) }

            Image(
                bitmap = ImageBitmap.imageResource(R.drawable.ic_github),
                modifier = Modifier
                    .width(50.dp)
                    .height(50.dp)
                    .weight(1f)
                    .clickable(
                        enabled = true,
                        onClick = {
                            context.startActivity(intentGit)
                        }
                    ),
                contentDescription = "Mail Y",
            )
        }

        Text(
            modifier = Modifier.fillMaxWidth().padding(top = 50.dp),
            text = "Многие фотографии билетов, решения и пр. были взяты из PMI_Legacy. Около подобных материалов прилагается ссылка на оригинальный источник",
            textAlign = TextAlign.Center,
            fontSize = 18.sp,
        )
        Text(
            modifier = Modifier.fillMaxWidth(),
            text = "PMI_Legacy",
            textAlign = TextAlign.Center,
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold,
        )

        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(top = 20.dp)) {

            val intentVk = remember { Intent(Intent.ACTION_VIEW, Uri.parse(PMI_VK)) }

            Image(
                imageVector = ImageVector.vectorResource(R.drawable.vk),
                modifier = Modifier
                    .width(50.dp)
                    .height(50.dp)
                    .weight(1f)
                    .clickable(
                        enabled = true,
                        onClick = {
                            context.startActivity(intentVk)
                        }
                    ),
                contentDescription = "VK PMI",
            )

            val intentGit = remember { Intent(Intent.ACTION_VIEW, Uri.parse(PMI_GIT)) }

            Image(
                bitmap = ImageBitmap.imageResource(R.drawable.ic_github),
                modifier = Modifier
                    .width(50.dp)
                    .height(50.dp)
                    .weight(1f)
                    .clickable(
                        enabled = true,
                        onClick = {
                            context.startActivity(intentGit)
                        }
                    ),
                contentDescription = "Mail PMI",
            )
        }
    }
}

private const val Y_VK = "https://vk.com/yanaglad12"
private const val Y_MAIL = "monsterglad12@gmail.com"
private const val Y_GIT = "https://github.com/YanaGlad"
private const val PMI_GIT = "https://github.com/appliedMathematicsAndComputerScience/PMI_legacy"
private const val PMI_VK = "https://vk.com/legacy20"

private fun copyToClipBoard(context: Context, text: String) {
    val clipboard = context.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
    val clip: ClipData = ClipData.newPlainText("email", text)
    clipboard.setPrimaryClip(clip)
    Toast.makeText(context, "Адрес электронной почти скопирован", Toast.LENGTH_SHORT).show()
}
