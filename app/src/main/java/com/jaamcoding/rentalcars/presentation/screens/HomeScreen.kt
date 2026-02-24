package com.jaamcoding.rentalcars.presentation.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jaamcoding.rentalcars.presentation.components.CardList
import com.jaamcoding.rentalcars.presentation.ui.theme.Blur
import com.jaamcoding.rentalcars.presentation.ui.theme.RentalCarsTheme
import dev.chrisbanes.haze.HazeState
import dev.chrisbanes.haze.HazeStyle
import dev.chrisbanes.haze.haze

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    hazeState: HazeState,
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
        HomeScreen(hazeState = hazeState)
    }

}