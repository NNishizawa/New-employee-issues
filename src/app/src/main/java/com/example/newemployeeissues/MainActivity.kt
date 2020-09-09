package com.example.newemployeeissues

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var window = Window()

        btn_onCreateWindow.setOnClickListener {
            var newWindow = Window()
            window.onCreateWindow(newWindow)
        }

        btn_onDestroyWindow.setOnClickListener {
            window.onDestroyWindow()
        }

        btn_getTopWindow.setOnClickListener {
            val topWindow = window.getTopWindow()
        }
    }
}