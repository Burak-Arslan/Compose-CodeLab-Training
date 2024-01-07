package com.biletdukkani.composecodelab

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.biletdukkani.composecodelab.composescreen.FastTransactionComposableScreen
import com.biletdukkani.composecodelab.ui.theme.ComposeCodeLabTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeCodeLabTheme {
                GreetingPreview()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeCodeLabTheme {
        FastTransactionComposableScreen()

        // Surface(
        //     color = MaterialTheme.colorScheme.background
        // ) {
        //     Row {
        //         BottomNavigation()
        //         HomeScreen()
        //     }
        // }
    }
}