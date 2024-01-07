package com.biletdukkani.composecodelab.composescreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun FastTransactionComposableScreen(
) {
    Column {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(start = 20.dp, top = 20.dp)
        ) {
            Icon(Icons.Filled.Face, contentDescription = null)
            Text(text = "Hızl İşlemler", Modifier.padding(start = 10.dp))
        }

        Row(
            modifier = Modifier.padding(all = 20.dp)
        ) {

            FastTransactionItem(
                color = Color.DarkGray,
                shape = MaterialTheme.shapes.small,
                modifier = Modifier
                    .weight(1F)
                    .padding(end = 10.dp),
                icons = Icons.Filled.LocationOn,
                transactionName = "PNR Sorgula",
                onClickItem = {

                }
            )

            FastTransactionItem(
                color = Color.DarkGray,
                shape = MaterialTheme.shapes.small,
                modifier = Modifier
                    .weight(1F)
                    .padding(end = 10.dp),
                icons = Icons.Filled.Send,
                transactionName = "Check In",
                onClickItem = {

                }
            )
        }

        Row(
            modifier = Modifier.padding(start = 20.dp, end = 20.dp)
        ) {

            FastTransactionItem(
                color = Color.DarkGray,
                shape = MaterialTheme.shapes.small,
                modifier = Modifier.padding(end = 10.dp),
                icons = Icons.Filled.Build,
                transactionName = "Bakiye Yükle",
                onClickItem = {

                }
            )
        }

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(start = 20.dp, top = 20.dp)
        ) {
            Icon(Icons.Filled.DateRange, contentDescription = null)
            Text(text = "Kampanyalar", modifier = Modifier.padding(start = 10.dp))
        }
    }
}