package com.example.depenseprojet

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.depenseprojet.navigation.DepenseNavigation
import com.example.depenseprojet.ui.theme.DepenseProjetTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DepenseNavigation()
        }
    }
}


@Composable
fun MyApp(content: @Composable () -> Unit){
    DepenseProjetTheme {
        content()
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApp {
        DepenseNavigation()
    }
}