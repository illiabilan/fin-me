package com.beelancrp.finme.onboard

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.beelancrp.finme.ui_kit.components.PrimaryLargeButton
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.rememberPagerState

@ExperimentalPagerApi
@Composable
fun OnboardScreen() {
    Box(modifier = Modifier.fillMaxSize()) {
        Column(Modifier.fillMaxSize()) {


            PrimaryLargeButton(text = "Some text here", modifier = Modifier.padding(horizontal = 16.dp)) {

            }
        }
    }
}

@ExperimentalPagerApi
@Preview(showBackground = false)
@Composable
fun Preview() {
    OnboardScreen()
}