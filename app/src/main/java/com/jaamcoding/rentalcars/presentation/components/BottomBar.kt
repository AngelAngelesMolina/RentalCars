package com.jaamcoding.rentalcars.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.LibraryBooks
import androidx.compose.material.icons.rounded.AccountBox
import androidx.compose.material.icons.rounded.Analytics
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jaamcoding.rentalcars.presentation.ui.theme.Blur
import com.jaamcoding.rentalcars.presentation.ui.theme.RentalCarsTheme

data class BottomBarItem(
    val title: String,
    val icon: ImageVector,
    val isSelected: Boolean
)

val bottomBarItems = listOf(
    BottomBarItem(
        title = "Home",
        icon = Icons.Rounded.Home,
        isSelected = true
    ),
    BottomBarItem(
        title = "Account",
        icon = Icons.Rounded.AccountBox,
        isSelected = false
    ),
    BottomBarItem(
        title = "Booked",
        icon = Icons.AutoMirrored.Rounded.LibraryBooks,
        isSelected = false
    ),
    BottomBarItem(
        title = "Settings",
        icon = Icons.Rounded.Settings,
        isSelected = false
    )
)

@Composable
fun BottomBar(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .clip(RoundedCornerShape(26.dp))
            .padding(horizontal = 14.dp, vertical = 10.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround
    ) {

        bottomBarItems.forEach {
            if (it.isSelected) {
                Box(
                    modifier = Modifier
                        .size(38.dp)
                        .border(
                            width = 1.dp,
                            color = Color.White,
                            shape = RoundedCornerShape(14.dp)
                        )
                        .clip(
                            RoundedCornerShape(14.dp)
                        )
                        .background(Blur),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = it.icon,
                        contentDescription = it.title,
                        tint = Color.White,
                        modifier = Modifier.size(28.dp)
                    )
                }
            } else {
                Icon(
                    imageVector = it.icon,
                    contentDescription = it.title,
                    tint = Color.White,
                    modifier = Modifier.size(28.dp)
                )
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
private fun BottomBarPrev() {
    RentalCarsTheme() {
        BottomBar()
    }
}