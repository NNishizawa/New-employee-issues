package com.example.newemployeeissues

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var infoList = listOf<PersonBase>(
            PersonMale("山田 太郎", 56),
            PersonMale("山本 博", 78),
            PersonFemale("山田 花子", 162),
            PersonMale("井上 悟", 64),
            PersonFemale("佐藤 由紀子", 146)
        )

        var i = 1
        infoList.forEach {
            System.out.println(it.show(i))
            i++
        }
    }
}