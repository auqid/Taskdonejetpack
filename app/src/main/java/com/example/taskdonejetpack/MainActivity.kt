package com.example.taskdonejetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.taskdonejetpack.ui.theme.TaskDoneJetpackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TaskDoneJetpackTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    text(text1 = "Task Done", text2 = "Nice Work")
                }
            }
        }
    }
}

@Composable
fun text(text1:String,text2:String){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        val image = painterResource(id= R.drawable.ic_task_completed)

        Image(
            painter = image,
            contentDescription = null,


            )
        Text(
            text = text1,
            modifier = Modifier
                .padding( bottom = 9.dp, top = 24.dp),
            fontWeight = FontWeight.Bold
        )
        Text(
            text= text2,
            fontSize = 16.sp
        )




    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TaskDoneJetpackTheme {
        text(text1 = "Task Completed", text2 = "Nice Work!")
    }
}



