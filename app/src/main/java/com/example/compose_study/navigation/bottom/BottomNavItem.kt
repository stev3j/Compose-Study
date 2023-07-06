package com.example.compose_study.navigation.bottom

import com.example.compose_study.R

sealed class BottomNavItem(var title: String, var icon: Int, var route: String) {
    object Home: BottomNavItem("Home", R.drawable.ic_home, "home")
    object Comm: BottomNavItem("Comm", R.drawable.ic_comm, "comm")
    object Profile: BottomNavItem("Profile", R.drawable.ic_profile, "profile")
}