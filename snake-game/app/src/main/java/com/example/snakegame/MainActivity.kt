package com.example.snakegame

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SnakeGameScreen()
        }
    }
}

@Composable
fun SnakeGameScreen() {
    var score by remember { mutableStateOf(0) }
    var gameOver by remember { mutableStateOf(false) }
    // Simple Snake implementation would go here - this is a placeholder for demo
    Column(
        modifier = Modifier.fillMaxSize().background(Color.Black),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("Snake Game", color = Color.White, style = MaterialTheme.typography.headlineMedium)
        Text("Score: $score", color = Color.Green)
        if (gameOver) {
            Text("Game Over!", color = Color.Red)
        }
        // Canvas for game board would be added here
        Button(onClick = { /* start game */ }) {
            Text("Start Game")
        }
    }
}
