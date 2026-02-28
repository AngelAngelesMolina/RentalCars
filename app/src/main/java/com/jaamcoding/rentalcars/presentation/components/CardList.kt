package com.jaamcoding.rentalcars.presentation.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jaamcoding.rentalcars.domain.model.luxuriousCars
import com.jaamcoding.rentalcars.presentation.ui.theme.RentalCarsTheme

@Composable
fun CardList(
    modifier: Modifier = Modifier,
    paddingValues: PaddingValues
) {
    LazyColumn(
        modifier = modifier,
        contentPadding = PaddingValues(
            top = paddingValues.calculateTopPadding() + 22.dp,
            bottom = 90.dp
        )
    ) {
        itemsIndexed(luxuriousCars) { index, car ->
            CardItem(
                car = car, modifier = Modifier
                    .fillMaxWidth()
                    .height(230.dp)
            )
            Spacer(modifier = Modifier.height(22.dp))
        }

    }


}

@Preview(showBackground = true)
@Composable
private fun CardListPrev() {
    RentalCarsTheme {
        CardList(paddingValues = PaddingValues())
    }
}