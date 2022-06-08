package com.beelancrp.finme.onboard

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.beelancrp.finme.R
import com.beelancrp.finme.onboard.data.OnboardItem
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class OnBoardViewModel @Inject constructor() : ViewModel() {

    val onBoardItemsState: State<List<OnboardItem>> = mutableStateOf(
        listOf(
            OnboardItem(
                R.string.onboard_page_1_title,
                R.string.onboard_page_1_desc,
                R.drawable.img_money
            ),
            OnboardItem(
                R.string.onboard_page_2_title,
                R.string.onboard_page_2_desc,
                R.drawable.img_list
            ),
            OnboardItem(
                R.string.onboard_page_3_title,
                R.string.onboard_page_3_desc,
                R.drawable.img_plan
            )
        )
    )
}