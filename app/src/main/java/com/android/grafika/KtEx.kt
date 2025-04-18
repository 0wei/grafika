package com.android.grafika

import android.app.Activity
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


fun javaEnableEdgeToEdge(activity:ComponentActivity) = activity.enableEdgeToEdge()
fun javaSetOnApplyWindowInsetsListener(activity:Activity) = ViewCompat.setOnApplyWindowInsetsListener(
    activity.findViewById(android.R.id.content)) { v, insets ->
    val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
    v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
    insets
}