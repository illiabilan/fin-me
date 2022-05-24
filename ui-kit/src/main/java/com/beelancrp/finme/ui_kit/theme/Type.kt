package com.beelancrp.finme.ui_kit.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.beelancrp.finme.ui_kit.R

// Set of Material typography styles to start with
val Typography = Typography(
    defaultFontFamily = FontFamily(Font(R.font.inter)),
    h1 = TextStyle(
        color = Dark75,
        fontWeight = FontWeight.Normal,
        fontSize = 64.sp,
        lineHeight = 80.sp,
    ),
    h2 = TextStyle(
        color = Dark75,
        fontWeight = FontWeight.Normal,
        fontSize = 32.sp,
        lineHeight = 34.sp
    ),
    h3 = TextStyle(
        color = Dark75,
        fontWeight = FontWeight.Normal,
        fontSize = 24.sp,
        lineHeight = 29.sp
    ),
    h4 = TextStyle(
        color = Dark75,
        fontWeight = FontWeight.Normal,
        fontSize = 18.sp,
        lineHeight = 22.sp
    ),
    body1 = TextStyle(
        color = Dark75,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 19.sp
    ),
    body2 = TextStyle(
        color = Dark75,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        lineHeight = 18.sp
    ),
    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    )
     */
    caption = TextStyle(
        color = Dark75,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        lineHeight = 12.sp
    )

)