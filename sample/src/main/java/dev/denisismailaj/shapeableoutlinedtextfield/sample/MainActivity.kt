package dev.denisismailaj.shapeableoutlinedtextfield.sample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import dev.denisismailaj.shapeableoutlinedtextfield.ShapeableOutlinedTextField

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                LazyColumn(
                    modifier = Modifier.padding(12.dp)
                ) {
                    for (radius in 0..6) {
                        item {
                            ExampleUse((radius * 2).dp)
                        }
                    }
                }

            }
        }
    }
}

@Composable
fun ExampleUse(
    cornerRadius: Dp
) {
    var text by remember { mutableStateOf("") }

    ShapeableOutlinedTextField(
        value = text,
        onValueChange = { text = it },
        cornerRadius = cornerRadius,
        label = {
            Text("Example with $cornerRadius")
        },
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 8.dp, bottom = 16.dp)
    )
}
