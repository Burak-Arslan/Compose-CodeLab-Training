package com.biletdukkani.composecodelab.composescreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

@Composable
fun FastTransactionItem(
    color: Color,
    shape: Shape,
    modifier: Modifier = Modifier,
    icons: ImageVector,
    transactionName: String,
    onClickItem: () -> Unit
) {
    Surface(
        color = color,
        shape = shape,
        modifier = modifier,
        onClick = { onClickItem.invoke() }
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(all = 20.dp),

            ) {
            Icon(icons, contentDescription = null)
            Text(text = transactionName, Modifier.padding(20.dp))
        }
    }
}