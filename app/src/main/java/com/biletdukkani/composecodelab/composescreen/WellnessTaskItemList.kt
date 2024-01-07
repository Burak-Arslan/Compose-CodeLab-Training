package com.biletdukkani.composecodelab.composescreen

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@Composable
fun WellnessTaskItemList(
    taskName: String,
    modifier: Modifier = Modifier
) {
    var checkedState by remember { mutableStateOf(false) }

    WorkTaskItemList(
        taskName = taskName,
        checked = checkedState,
        onCheckedChange = { newValue -> checkedState = newValue },
        onClose = { },
        modifier = modifier
    )
}