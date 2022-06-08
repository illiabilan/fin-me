package com.beelancrp.finme.onboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.beelancrp.finme.R
import com.beelancrp.finme.onboard.domain.model.OnboardItem
import com.beelancrp.finme.ui_kit.components.PrimaryLargeButton
import com.beelancrp.finme.ui_kit.components.SecondaryLargeButton
import com.beelancrp.finme.ui_kit.theme.Dark50
import com.beelancrp.finme.ui_kit.theme.FinMeTheme
import com.beelancrp.finme.ui_kit.theme.Light20
import com.beelancrp.navigation.domain.model.Navigation
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.HorizontalPagerIndicator
import com.google.accompanist.pager.rememberPagerState

@ExperimentalPagerApi
@Composable
fun OnboardScreen(navController: NavController, viewModel: OnBoardViewModel = hiltViewModel()) {
    Box(modifier = Modifier.fillMaxSize()) {
        val pagerState = rememberPagerState()
        val onboardItemsState by viewModel.onBoardItemsState

        HorizontalPager(
            modifier = Modifier.fillMaxHeight(0.7f),
            count = onboardItemsState.size,
            state = pagerState
        ) { index ->
            OnboardPage(item = onboardItemsState[index])
        }

        Column(
            Modifier.align(Alignment.BottomCenter),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            HorizontalPagerIndicator(pagerState = pagerState)

            val resources = LocalContext.current.resources
            val signUpText = resources.getString(R.string.button_sign_up)
            val loginText = resources.getString(R.string.button_login)
            PrimaryLargeButton(
                text = signUpText,
                modifier = Modifier
                    .padding(PaddingValues(16.dp, 16.dp, 16.dp))
            ) {

            }

            SecondaryLargeButton(
                text = loginText,
                modifier = Modifier
                    .padding(16.dp)
            ) {
                viewModel.login()
                navController.navigate(Navigation.Home.route)
            }
        }
    }
}

@Composable
fun OnboardPage(item: OnboardItem) {
    Column(
        Modifier
            .fillMaxWidth()
            .padding(32.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        val resources = LocalContext.current.resources
        val title = resources.getString(item.title)
        val desc = resources.getString(item.desc)

        Image(
            modifier = Modifier
                .fillMaxHeight(0.5f)
                .clip(RoundedCornerShape(40.dp)),
            painter = painterResource(id = item.image),
            contentDescription = title
        )
        Text(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.CenterHorizontally)
                .padding(top = 42.dp),
            text = title,
            style = MaterialTheme.typography.h2,
            fontWeight = FontWeight.Bold,
            color = Dark50,
            textAlign = TextAlign.Center
        )
        Text(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.CenterHorizontally)
                .padding(top = 16.dp),
            text = desc,
            style = MaterialTheme.typography.body1,
            color = Light20,
            textAlign = TextAlign.Center
        )
    }
}

@ExperimentalPagerApi
@Preview(showBackground = true)
@Composable
fun Preview() {
    FinMeTheme {
        val nav = rememberNavController()
        OnboardScreen(nav)
    }
}