package com.example.compose_study.topbar

import androidx.compose.foundation.background
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import com.example.compose_study.R

@ExperimentalMaterial3Api
@Composable
fun TopBar() {
    TopAppBar(
        title = { Text(text = "") },
        colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = Color.White),
        actions = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(painter = painterResource(id = R.drawable.ic_add_content), contentDescription = null)
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(painter = painterResource(id = R.drawable.ic_menu), contentDescription = null)
            }
        }
    )
}