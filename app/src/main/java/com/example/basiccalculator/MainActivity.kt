package com.example.basiccalculator

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            var num1 by remember { mutableStateOf("0") }
            var num2 by remember { mutableStateOf("0") }
            Column {
                Spacer(modifier = Modifier.height(275.dp))
                TextField(value = num1, onValueChange = {
                    num1 = it;
                })
                Spacer(modifier = Modifier.height(20.dp))

                TextField(value = num2, onValueChange = {
                    num2 = it;
                })
                Spacer(modifier = Modifier.height(20.dp))
                Row {
                    Button(onClick = {
                        var result = num1.toInt() + num2.toInt()
                        Toast.makeText(applicationContext,"Result is $result",Toast.LENGTH_SHORT).show()
                    }) {
                        Text(text = "Addition")
                    }
                    Spacer(modifier = Modifier.width(14.dp))
                    Button(onClick = {
                        var result = num1.toInt() - num2.toInt()
                        Toast.makeText(applicationContext,"Result is $result",Toast.LENGTH_SHORT).show()
                    }) {
                        Text(text = "Subtraction")
                    }
                }
                Spacer(modifier = Modifier.height(20.dp))
                Row {
                    Button(onClick = {
                        var result = num1.toInt() * num2.toInt()
                        Toast.makeText(applicationContext,"Result is $result",Toast.LENGTH_SHORT).show()
                    }) {
                        Text(text = "Multiplication")
                    }
                    Spacer(modifier = Modifier.width(14.dp))
                    Button(onClick = {
                        var result = num1.toInt() / num2.toInt()
                        Toast.makeText(applicationContext,"Result is $result",Toast.LENGTH_SHORT).show()
                    }) {
                        Text(text = "Division")
                    }
                }
            }
        }
        }

}

