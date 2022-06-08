package com.beelancrp.finme.ui_kit.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.beelancrp.finme.ui_kit.theme.ButtonsShapes

@Composable
fun PrimaryButton(
    text: String,
    modifier: Modifier = Modifier,
    shape: Shape = ButtonsShapes.large,
    onClick: () -> Unit
) {
    val primaryButtonColors = ButtonDefaults.buttonColors(
        MaterialTheme.colors.primary,
        MaterialTheme.colors.onPrimary
    )
    Button(
        modifier = modifier,
        shape = shape,
        colors = primaryButtonColors,
        contentPadding = PaddingValues(16.dp),
        onClick = onClick
    ) {
        Text(
            text = text,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight(),
            style = MaterialTheme.typography.h4,
            fontWeight = FontWeight.SemiBold,
            color = MaterialTheme.colors.onPrimary,
            textAlign = TextAlign.Center
        )
    }
}

@Composable
fun SecondaryButton(
    text: String,
    modifier: Modifier = Modifier,
    shape: Shape = ButtonsShapes.large,
    onClick: () -> Unit
) {
    val primaryButtonColors = ButtonDefaults.buttonColors(
        MaterialTheme.colors.secondary,
        MaterialTheme.colors.onSecondary
    )
    Button(
        modifier = modifier,
        shape = shape,
        colors = primaryButtonColors,
        contentPadding = PaddingValues(16.dp),
        onClick = onClick
    ) {
        Text(
            text = text,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight(),
            style = MaterialTheme.typography.h4,
            fontWeight = FontWeight.SemiBold,
            color = MaterialTheme.colors.onSecondary,
            textAlign = TextAlign.Center
        )
    }
}

@Composable
fun PrimaryLargeButton(text: String, modifier: Modifier = Modifier, onClick: () -> Unit) {
    PrimaryButton(text, modifier = modifier.defaultMinSize(342.dp, 56.dp), onClick = onClick)
}

@Composable
fun PrimarySmallButton(text: String, modifier: Modifier = Modifier, onClick: () -> Unit) {
    PrimaryButton(
        text,
        modifier = modifier.defaultMinSize(164.dp, 56.dp),
        shape = ButtonsShapes.medium,
        onClick = onClick
    )
}

@Composable
fun SecondaryLargeButton(text: String, modifier: Modifier = Modifier, onClick: () -> Unit) {
    SecondaryButton(text, modifier = modifier.defaultMinSize(342.dp, 56.dp), onClick = onClick)
}

@Composable
fun SecondarySmallButton(text: String, modifier: Modifier = Modifier, onClick: () -> Unit) {
    SecondaryButton(
        text,
        modifier = modifier.defaultMinSize(164.dp, 56.dp),
        shape = ButtonsShapes.medium,
        onClick = onClick
    )
}


