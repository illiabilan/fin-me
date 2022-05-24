package com.beelancrp.finme.ui_kit.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val LightColorPalette = lightColors(
    primary = Violet100,
    secondary = Violet20,
    primaryVariant = Violet80,
    background = Light100,
    surface = Light20,
    onPrimary = Light100,
    onSecondary = Violet100,
    onBackground = Dark75,
    onSurface = Dark100
)

@Composable
fun FinMeTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colors = LightColorPalette,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}