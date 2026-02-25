package com.jaamcoding.rentalcars.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jaamcoding.rentalcars.presentation.ui.theme.RentalCarsTheme

@Composable
fun Rater(
    modifier: Modifier = Modifier, image: Int
) {
    Image(
        painter = painterResource(image),
        contentDescription = "Rater",
        modifier = modifier
            .size(30.dp)
            .clip(CircleShape)
            .border(
                color = Color.Black,
                width = 1.dp,
                shape = CircleShape
            )
    )

}

@Preview(showBackground = true)
@Composable
private fun RaterPrev() {
    RentalCarsTheme {
        Rater(image = com.jaamcoding.rentalcars.R.drawable.m_1)
    }
}
