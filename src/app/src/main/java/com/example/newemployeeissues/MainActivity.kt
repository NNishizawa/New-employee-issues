package com.example.newemployeeissues

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Gender.MALE.show(1, PersonMale("山田 太郎", 56))
        Gender.MALE.show(2, PersonMale("山本 博", 78))
        Gender.FEMALE.show(3, PersonFemale("山田 花子", 162))
        Gender.MALE.show(4, PersonMale("井上 悟", 64))
        Gender.FEMALE.show(5, PersonFemale("佐藤 由紀子", 146))
    }
}