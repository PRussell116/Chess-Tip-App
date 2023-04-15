package com.example.chesstips

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.chesstips.Model.tipsCollection
import com.example.chesstips.ui.theme.ChessTipsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ChessTipsTheme {
                // A surface container using the 'background' color from the theme
                ChessTipApp()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ChessTipApp(
){
    Scaffold(
        topBar = { ChessTipTopBar() }
    )
    { contentPadding -> Box(modifier = Modifier.padding(contentPadding))
        {
            TipColumn(tips = tipsCollection)
        }

    }

}

@Preview(showBackground = true)
@Composable
fun ChessTipAppPreview() {
    ChessTipsTheme {
        ChessTipApp()
    }
}