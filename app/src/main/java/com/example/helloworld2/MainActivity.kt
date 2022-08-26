package com.example.helloworld2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloWorld2(stringResource(id = R.string.hello) + " " + stringResource(id = R.string.world) + "!")
        }
    }
}

@Composable
fun HelloWorld2(defaultText: String){
    var text by remember { mutableStateOf(defaultText) }
    var isHello by remember { mutableStateOf(true) }
    val context = LocalContext.current
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Surface(
            color = colorResource(id = R.color.light_blue),
            elevation = 2.dp,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(.5f)
                .padding(10.dp)
        ){
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = text,
                    modifier = Modifier.fillMaxHeight(.5f)
                )
                Surface(
                    elevation = 8.dp,
                    color = colorResource(id = R.color.dark_blue),
                    modifier = Modifier
                        .fillMaxHeight()
                        .fillMaxWidth(.5f)
                        .padding(10.dp)
                ){
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(
                            "2",
                            color = Color.White
                        )
                    }
                }
            }
        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Bottom,
            modifier = Modifier
                .fillMaxHeight()
                .padding(bottom = 10.dp)
        ) {
            Button(onClick = {
                text = if(isHello) context.getString(R.string.goodbye) + "!"
                    else context.getString(R.string.hello) + " " + context.getString(R.string.world) + "!"

                isHello = !isHello
            }) {
                Text(stringResource(id = R.string.click_me))
            }
        }
    }
}