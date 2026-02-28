package com.jaamcoding.rentalcars.presentation.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jaamcoding.rentalcars.presentation.components.BottomBar
import com.jaamcoding.rentalcars.presentation.components.CardList
import com.jaamcoding.rentalcars.presentation.ui.theme.Blur
import com.jaamcoding.rentalcars.presentation.ui.theme.RentalCarsTheme
import dev.chrisbanes.haze.HazeState
import dev.chrisbanes.haze.HazeStyle
import dev.chrisbanes.haze.haze
import dev.chrisbanes.haze.hazeChild

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    hazeState: HazeState,
    paddingValues: PaddingValues
) {
    Box(
        modifier = modifier
            .background(MaterialTheme.colorScheme.background)
    ) {
        CardList(
            modifier = Modifier
                .fillMaxSize()
                .haze(
                    state = hazeState,
                    style = HazeStyle(
                        blurRadius = 13.dp,
                        tint = Blur
                    ),
                ),
            paddingValues = paddingValues
        )
        BottomBar(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 26.dp)
                .align(Alignment.BottomStart)
                .padding(bottom = 26.dp)
                .hazeChild(
                    state = hazeState,
                    shape = RoundedCornerShape(26.dp)
                )
        )

    }

}


@Preview(showBackground = true)
@Composable
private fun HomeScreenPrev() {
    RentalCarsTheme {
        val hazeState = remember {
            HazeState()
        }
        HomeScreen(hazeState = hazeState, paddingValues = PaddingValues())
    }

}