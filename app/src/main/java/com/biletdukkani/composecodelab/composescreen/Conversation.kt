package com.biletdukkani.composecodelab.composescreen

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable


@Composable
fun Conversation() {
    LazyColumn {
        items(100) {
            RowColumn()
        }
    }
}