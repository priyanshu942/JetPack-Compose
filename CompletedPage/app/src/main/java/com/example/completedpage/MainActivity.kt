package com.example.completedpage

import android.os.Bundle
import android.text.Layout
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.completedpage.ui.theme.CompletedPageTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CompletedPageTheme {

                    ShowCard(
                        R.drawable.ic_task_completed,
                        "All tasks completed",
                        "Nice work!", modifier = Modifier)

            }
        }
    }
}


@Composable
fun ShowCard(image:Int,title:String, subtitle:String,modifier: Modifier)
{
    Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxSize()) {
//        Row {
//            Image(painter = painterResource(id = image) , contentDescription = null, alignment = Alignment.Center)
//        }
        Image(painter = painterResource(id = image) , contentDescription = null, alignment = Alignment.Center)
        Text(text = title, fontWeight = FontWeight.Bold, modifier = Modifier.padding(0.dp,24.dp,0.dp,8.dp))
        Text(text = subtitle, fontSize = 16.sp)
    }
   
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CompletedPageTheme {
        ShowCard(
            R.drawable.ic_task_completed,
            "All tasks completed",
            "Nice work!", modifier = Modifier)
    }
}