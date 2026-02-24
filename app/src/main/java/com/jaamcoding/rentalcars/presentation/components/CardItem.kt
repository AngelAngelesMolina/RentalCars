package com.jaamcoding.rentalcars.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jaamcoding.rentalcars.R
import com.jaamcoding.rentalcars.domain.model.Car
import com.jaamcoding.rentalcars.presentation.ui.theme.RentalCarsTheme
import com.jaamcoding.rentalcars.presentation.ui.theme.Secondary

@Composable
fun CardItem(
    modifier: Modifier = Modifier,
    car: Car
) {
    Box(
        modifier = modifier
            .padding(horizontal = 16.dp)
            .clip(RoundedCornerShape(40.dp))
            .background(car.bgColor)
    ) {
        Image(
            painter = painterResource(car.image),
            contentDescription = "${car.name} image",
            modifier = Modifier.offset(x = 150.dp, y = 0.dp)
        )
        Column(
            modifier = Modifier.fillMaxHeight(),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Column() {
                CardInfo(car = car)
                Spacer(modifier = Modifier.height(20.dp))
                Rating(car = car)
            }

        }


    }
}


@Preview(showBackground = true)
@Composable
private fun CardItemPrev() {
    RentalCarsTheme {
        CardItem(
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