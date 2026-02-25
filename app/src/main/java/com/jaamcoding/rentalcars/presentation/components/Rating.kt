package com.jaamcoding.rentalcars.presentation.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jaamcoding.rentalcars.R
import com.jaamcoding.rentalcars.domain.model.Car
import com.jaamcoding.rentalcars.presentation.ui.theme.RentalCarsTheme
import com.jaamcoding.rentalcars.presentation.ui.theme.Secondary

@Composable
fun Rating(modifier: Modifier = Modifier, car: Car) {
    var paddingRatingItem by remember { mutableIntStateOf(0) }

    Column(
        modifier = modifier
            .padding(start = 20.dp),
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box {
                car.recommenders.forEachIndexed { index, image ->
                    Rater(
                        image = image,
                        modifier = Modifier.padding(start = (index * 24).dp)
                    )
                }
            }
            Spacer(modifier = Modifier.width(10.dp))
            Text(
                text = car.recommendation.toString(),
                color = Color.Black,
                fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold
            )

        }
        Text(
            text = "${car.recommendation} % Recommended",
            color = Color.Black,
            fontSize = 12.sp,
            fontWeight = FontWeight.SemiBold
        )

    }

}


@Preview(showBackground = true)
@Composable
private fun RatingPrev() {
    RentalCarsTheme {
        Rating(
            modifier = Modifier
                .fillMaxWidth()
                .height(230.dp),
            Car(
                name = "Ferrari SF90 Stradale",
                image = R.drawable.ferrari_car,
                color = Color.Red,
                logo = R.drawable.ferrari_logo,
                recommendation = 97,
                recommendationRate = 4.8f,
                rentalDays = 7,
                price = 759,
                recommenders = listOf(
                    R.drawable.m_1, R.drawable.w_2, R.drawable.m_3
                ),
                bgColor = Secondary
            )
        )
    }
}