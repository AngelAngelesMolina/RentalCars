package com.jaamcoding.rentalcars.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jaamcoding.rentalcars.R
import com.jaamcoding.rentalcars.domain.model.Car
import com.jaamcoding.rentalcars.presentation.ui.theme.RentalCarsTheme
import com.jaamcoding.rentalcars.presentation.ui.theme.Secondary

@Composable
fun CardInfo(
    modifier: Modifier = Modifier,
    car: Car
) {
    Row(
        modifier = modifier
            .padding(
                top = 20.dp,
                start = 20.dp

            ), verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(car.logo),
            contentDescription = "${car.name} logo",
            modifier = Modifier
                .clip(RoundedCornerShape(100.dp))
                .background(MaterialTheme.colorScheme.background)
                .padding(6.dp)
                .size(35.dp)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Column() {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text =
                        "Color:",
                    fontSize = 12.sp,
                    color = Color.Black.copy(.8f)
                )
                Spacer(modifier = Modifier.width(4.dp))
                Box(
                    modifier = Modifier
                        .size(12.dp)
                        .clip(CircleShape)
                        .background(car.color)
                        .border(
                            width = 1.dp,
                            color = Color.Black,
                            shape = CircleShape
                        )
                )

            }
            Text(
                text =
                    car.name,
                fontSize = 12.sp,
                color = Color.Black,
                fontWeight = FontWeight.SemiBold
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
private fun CardInfoPrev() {
    RentalCarsTheme {
        CardInfo(
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