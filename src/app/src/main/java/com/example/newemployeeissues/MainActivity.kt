package com.example.newemployeeissues

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    var state :State = State.IDLE

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var event : Event = TODO("イベントを取得")

        when(event) {
            Event.BUTTON_PLAY -> { eventPlayButton() }
            Event.BUTTON_RECORD -> { eventRecordButton() }
            Event.BUTTON_STOP -> { eventStopButton() }
        }
    }

    fun eventPlayButton() {
        when (state) {
            State.IDLE -> { TODO("再生開始") }
            State.PLAYING -> {}
            State.RECORDING -> {
                TODO("録画停止")
                TODO("再生開始")
            }
        }
        state = State.PLAYING
    }

    fun eventRecordButton() {
        when (state) {
            State.IDLE -> { TODO("録画開始") }
            State.PLAYING -> {
                TODO("再生停止")
                TODO("録画開始")
            }
            State.RECORDING -> {}
        }
        state = State.RECORDING
    }

    fun eventStopButton() {
        when (state) {
            State.IDLE -> {}
            State.PLAYING -> { TODO("再生停止") }
            State.RECORDING -> { TODO("録画停止") }
        }
        state = State.IDLE
    }
}