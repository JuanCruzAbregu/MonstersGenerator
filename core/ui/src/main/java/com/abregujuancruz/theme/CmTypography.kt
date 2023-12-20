package com.abregujuancruz.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.abregujuancruz.ui.R

val typography = Typography(
    headlineSmall = TextStyle(
        fontWeight = FontWeight.SemiBold,
        fontFamily = CmFontFamily.Gibson,
        fontSize = 24.sp,
        lineHeight = 32.sp,
        letterSpacing = 0.sp
    ),
    titleLarge = TextStyle(
        fontWeight = FontWeight.Normal,
        fontFamily = CmFontFamily.Gibson,
        fontSize = 18.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    bodyLarge = TextStyle(
        fontWeight = FontWeight.Normal,
        fontFamily = CmFontFamily.Gibson,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.15.sp
    ),
    bodyMedium = TextStyle(
        fontWeight = FontWeight.Medium,
        fontFamily = CmFontFamily.Gibson,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.25.sp
    ),
    labelMedium = TextStyle(
        fontWeight = FontWeight.SemiBold,
        fontFamily = CmFontFamily.Gibson,
        fontSize = 12.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
)

@Immutable
private object CmFontFamily {
    @Stable
    val Gibson = FontFamily(
        Font(resId = R.font.gibson_semi_bold, weight = FontWeight.SemiBold), // Weight = 600
        Font(resId = R.font.gibson_medium, weight = FontWeight.Medium), // Weight = 500
        Font(resId = R.font.gibson_regular, weight = FontWeight.Normal) // Weight = 400
    )
}