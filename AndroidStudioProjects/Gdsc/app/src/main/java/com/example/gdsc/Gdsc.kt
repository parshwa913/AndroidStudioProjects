package com.example.gdsc


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.gdsc.ui.theme.GdscTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GdscTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.primary
                ) {
                    Gdsc()
                }
            }
        }
    }
}

@Composable
fun Gdsc() {
    var expanded = remember { mutableStateOf(false) }
    var extrapadding = if (expanded.value) 48.dp else 0.dp
    Surface(
        modifier = Modifier.padding(10.dp),
        color = MaterialTheme.colorScheme.primary
    ) {
        Row {
            Column (modifier = Modifier
                .weight(1f)
                .padding(bottom = extrapadding)) {
                Text(text = "Hello ")
                Text(text = "GDSC")
                if (expanded.value){
                    Text(text = "MY BUTTON IS WORKING YAAY!!")
                }
            }
            ElevatedButton(onClick = { expanded.value = !expanded.value }) {
                Text(if (expanded.value) "Show less" else "Show More")
            }
        }
    }
}

@Preview(showBackground = true, widthDp = 320)
@Composable
fun GdscPreview() {
    GdscTheme {
        Gdsc()
    }
}