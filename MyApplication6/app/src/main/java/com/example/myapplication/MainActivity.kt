package com.example.myapplication

import android.icu.text.CaseMap.Title
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {

                ComposeArticle(
                    stringResource(id = R.string.title),
                    stringResource(id = R.string.firstPara),
                    stringResource(id = R.string.secondPara),
                    modifier = Modifier.padding(16.dp))

            }
        }
    }
}

@Composable
fun ComposeArticle(title: String,firstpara:String, secondopara:String, modifier: Modifier = Modifier) {
  val image = painterResource(id = R.drawable.bg_compose_background)
    Column {
      Image(painter = image ,
          contentDescription = null)
      Text(text = title ,
          modifier = modifier,
          fontSize = 24.sp
          )
        Text(text = firstpara ,
            modifier = modifier,
        )
        Text(text = secondopara ,
            modifier = modifier,
            textAlign = TextAlign.Justify
        )
  }
}

@Preview(showBackground = true)
@Composable
fun ComposeArticle() {
    MyApplicationTheme {
        ComposeArticle(
            stringResource(id = R.string.title),
            stringResource(id = R.string.firstPara),
            stringResource(id = R.string.secondPara),
            modifier = Modifier.padding(16.dp))
    }
}