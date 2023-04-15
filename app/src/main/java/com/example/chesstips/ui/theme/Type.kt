package com.example.chesstips.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.chesstips.R

val Raleway = FontFamily(
    Font(R.font.raleway_bold),
    Font(R.font.raleway_thin),
    Font(R.font.raleway_extrabolditalic)
)
// Set of Material typography styles to start with
val Typography = Typography(
    bodyMedium = TextStyle(
        fontFamily = Raleway,
        fontWeight = FontWeight.Thin,
        fontSize = 14.sp

    ),
    headlineMedium = TextStyle(
        fontFamily = Raleway,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp
    ),
    headlineLarge = TextStyle(
        fontFamily = Raleway,
        fontWeight = FontWeight.ExtraBold,
        fontSize = 25.sp
    )


)