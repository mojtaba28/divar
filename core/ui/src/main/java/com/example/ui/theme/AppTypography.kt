package com.example.ui.theme

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDirection
import androidx.compose.ui.unit.sp
import com.example.ui.R

private val iranYekan= FontFamily(Font(R.font.iran_yekan_medium, FontWeight.Normal))
private val iranYekanBold = FontFamily(Font(R.font.iran_yekan_bold, FontWeight.Bold))

data class AppTypography(
    val titleLarge: TextStyle = TextStyle(
        fontFamily = iranYekanBold,
        fontWeight = FontWeight.Bold,
        textDirection = TextDirection.Rtl,
        fontSize = 24.sp,
    ),
    val title: TextStyle = TextStyle(
        fontFamily = iranYekanBold,
        textDirection = TextDirection.Rtl,
        fontWeight = FontWeight.Bold,
        fontSize = 18.sp
    ),

    val bodyMediumBold: TextStyle = TextStyle(
        fontFamily = iranYekanBold,
        textDirection = TextDirection.Rtl,
        fontWeight = FontWeight.Bold,
        fontSize = 16.sp
    ),
    val bodyLarge: TextStyle = TextStyle(
        fontFamily = iranYekan,
        fontWeight = FontWeight.Normal,
        textDirection = TextDirection.Rtl,
        fontSize = 18.sp
    ),
    val bodyMedium: TextStyle = TextStyle(
        fontFamily = iranYekan,
        textDirection = TextDirection.Rtl,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),

    val labelMedium: TextStyle = TextStyle(
        fontFamily = iranYekan,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        textDirection = TextDirection.Rtl,
        lineHeight = 24.sp
    ),

    val labelSmall: TextStyle = TextStyle(
        fontFamily = iranYekan,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        textDirection = TextDirection.Rtl
    )
)

val LocalTypography = staticCompositionLocalOf { AppTypography() }