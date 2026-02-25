package com.jaamcoding.rentalcars.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.ArrowForward
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
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
fun BuyButton(modifier: Modifier = Modifier, car: Car) {
    Row(
        modifier = modifier
            .clip(RoundedCornerShape(40.dp))
            .background(MaterialTheme.colorScheme.surfaceVariant)
            .padding(vertical = 8.dp)
            .padding(start = 25.dp, end = 16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {

        Column {
            Text(
                text = "${car.rentalDays} Days",
                fontSize = 12.sp,
                color = MaterialTheme.colorScheme.onBackground.copy(0.8f)
            )
            Text(
                text = "${car.price}.00",
                fontSize = 18.sp,
                color = MaterialTheme.colorScheme.onBackground,
                fontWeight = FontWeight.SemiBold
            )
        }
        Spacer(modifier = Modifier.width(12.dp))
        Icon(
            imageVector = Icons.AutoMirrored.Rounded.ArrowForward,
            tint = MaterialTheme.colorScheme.onBackground,
            modifier = Modifier.size(30.dp),
            contentDescription = "Buy"
        )


    }
}


@Preview(showBackground = true)
@Composable
private fun BuyButtonPrev() {
    RentalCarsTheme {
        BuyButton(
            modifier = Modifier
                .fillMaxWidth()
                .height(230.dp),
            car = Car(
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