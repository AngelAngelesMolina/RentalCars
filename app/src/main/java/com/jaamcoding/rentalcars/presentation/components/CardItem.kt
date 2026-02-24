package com.jaamcoding.rentalcars.presentation.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.jaamcoding.rentalcars.presentation.ui.theme.RentalCarsTheme

@Composable
fun CardItem(modifier: Modifier = Modifier) {

}

@Preview(showBackground = true)
@Composable
private fun CardItemPrev() {
    RentalCarsTheme {
        CardItem()
    }
}