package com.biletdukkani.composecodelab.composescreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun WaterCounter(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.padding(16.dp)
    ) {

        var waterCount by rememberSaveable { mutableStateOf(0) }

        if (waterCount > 0) {

            var showTask by rememberSaveable { mutableStateOf(true) }

            if (showTask) {
                WellnessTaskItem(
                    taskName = "Bugün yürüyüş yaptınız mı?",
                    onClose = { showTask = false }
                )
            }
            Text(
                text = "Bugün kaç bardak su içtiniz? $waterCount",
                modifier = modifier.padding(16.dp)
            )
        }

        Row(
            modifier = Modifier.padding(top = 8.dp)
        ) {
            Button(
                onClick = { waterCount++ },
                Modifier.padding(top = 16.dp),
                enabled = waterCount < 10
            ) {
                Text(text = "Bardak Ekle")
            }

            Button(onClick = { waterCount = 0 }, Modifier.padding(start = 16.dp, top = 16.dp)) {
                Text(text = "Sıfırla")

            }
        }
    }
}