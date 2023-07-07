package com.example.compose_study.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compose_study.ui.theme.ComposeStudyTheme
import com.example.compose_study.ui.theme.MyColor


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@ExperimentalMaterial3Api
@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(horizontal = 16.dp)
    ) {
        Spacer(modifier = Modifier.height(60.dp))
        Text(
            text = "stev3j님의\n행복한 순간들",
            color = Color.Black,
            style = MaterialTheme.typography.titleMedium
        )
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(30.dp),
            contentPadding = PaddingValues(vertical = 30.dp)
        ) {
            items(days) { day ->
                Row {
                    HappyBox(day)
                }
            }
        }
    }
}

data class Day(val day: String, val year: String)

val days = listOf(
    Day("6월 9일", "2023년"),
    Day("6월 10일", "2023년"),
    Day("6월 11일", "2023년"),
)

@Composable
fun HappyBox(
    day: Day
) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .height(360.dp),
        shape = RoundedCornerShape(20.dp),
        color = MyColor.Container
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.weight(1f))
            Text(
                text = day.day,
                color = Color.White,
                style = MaterialTheme.typography.titleLarge
            )
            Text(
                text = day.year,
                color = Color.White,
                style = MaterialTheme.typography.titleSmall
            )
            Spacer(modifier = Modifier.height(30.dp))
        }
    }
}

@ExperimentalMaterial3Api
@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    ComposeStudyTheme {
        HomeScreen()
    }
}

@Preview(showBackground = true)
@Composable
fun HappyBoxPreview() {
    ComposeStudyTheme {
        HappyBox(day = Day("6월 9일", "2023년"))
    }
}