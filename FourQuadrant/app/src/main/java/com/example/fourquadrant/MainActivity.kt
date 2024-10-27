package com.example.fourquadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.CacheDrawModifierNode
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.fourquadrant.ui.theme.FourQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FourQuadrantTheme {

            }
        }
    }
}

@Composable
fun Four(){
    Column {
        Row (Modifier.weight(1f)){
            Quadrant("Text composable","Displays text and follows the recommended Material Design guidelines.",
                color = Color(0xFFEADDFF), modifier = Modifier.weight(1f))
            Quadrant("Image composable","Creates a composable that lays out and draws a given Painter class object.",
                color = Color(0xFFD0BCFF), modifier = Modifier.weight(1f))
        }
        Row (Modifier.weight(1f)){
            Quadrant("Row composable","A layout composable that places its children in a horizontal sequence.",
                color = Color(0xFFB69DF8), modifier = Modifier.weight(1f))
            Quadrant("Column composable","A layout composable that places its children in a vertical sequence",
                color = Color(0xFFF6EDFF), modifier = Modifier.weight(1f))
        }
    }
}

@Composable
fun Quadrant(tite:String,desc:String,color: Color,modifier: Modifier)
{
    Column(modifier = modifier
        .fillMaxSize()
        .background(color).padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = tite, fontWeight = FontWeight.Bold, modifier = Modifier.padding(0.dp,0.dp,0.dp,16.dp))
        Text(text = desc, textAlign = TextAlign.Center)
    }
}
@Preview(showBackground = true)
@Composable
fun ComposeQuadrantAppPreview() {
    FourQuadrantTheme {
        Four()
    }
}