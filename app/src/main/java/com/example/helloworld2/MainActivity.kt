package com.example.helloworld2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.helloworld2.ui.theme.HelloWorld2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloWorld2()
            /*Column(
                verticalArrangement = Arrangement.Bottom,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .padding(10.dp)
                    .background(colorResource(id = R.color.light_blue))
                    .fillMaxWidth()
                    .fillMaxHeight(.5f)
                    .wrapContentWidth(Alignment.CenterHorizontally)
                    .shadow(2.dp)
            ) {
                Text(
                    text = "Hello World",
                    fontSize = 24.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .fillMaxHeight(.5f)
                )
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .padding(10.dp)
                        .fillMaxHeight()
                        .fillMaxWidth(.6f)
                        .background(colorResource(id = R.color.dark_blue))


                ){
                    Text(
                        text = "2",
                        fontSize = 24.sp,
                        color = Color.White
                    )
                }

            }*/
        }
    }
}

@Composable
fun HelloWorld2(){
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        MyDisplay()
        MyInputs()
    }
}

@Composable
fun MyDisplay(){
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
            Greeting(name = "")
            NumberDisplay()
        }
    }
}

@Composable
fun Greeting(name: String) {
    val text = if ("".equals(name)) stringResource(id = R.string.world) else name
    Text(
        text = "${stringResource(id = R.string.hello)} $text!",
        modifier = Modifier.fillMaxHeight(.5f)
    )
}

@Composable
fun NumberDisplay(){
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

@Composable
fun MyInputs(){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom,
        modifier = Modifier
            .fillMaxHeight()
            .padding(bottom = 10.dp)
    ) {
        Button(onClick = { /*TODO*/ }) {
            Text(stringResource(id = R.string.click_me))
        }
    }
}