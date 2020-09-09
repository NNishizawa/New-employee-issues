package com.example.newemployeeissues

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var state :State = State.IDLE

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_event_play.setOnClickListener {
            eventChg(Event.BUTTON_PLAY)
        }

        btn_event_record.setOnClickListener {
            eventChg(Event.BUTTON_RECORD)
        }

        btn_event_stop.setOnClickListener {
            eventChg(Event.BUTTON_STOP)
        }
    }

    private fun eventChg(event: Event) {
        when(event) {
            Event.BUTTON_PLAY -> { eventPlayButton() }
            Event.BUTTON_RECORD -> { eventRecordButton() }
            Event.BUTTON_STOP -> { eventStopButton() }
        }
    }

    private fun eventPlayButton() {
        when (state) {
            State.IDLE -> {
                // TODO("再生開始")
                System.out.println("再生開始")
            }
            State.PLAYING -> {}
            State.RECORDING -> {
                // TODO("録画停止")
                System.out.println("録画停止")

                // TODO("再生開始")
                System.out.println("再生開始")
            }
        }
        state = State.PLAYING
    }

    private fun eventRecordButton() {
        when (state) {
            State.IDLE -> {
                // TODO("録画開始")
                System.out.println("録画開始")
            }
            State.PLAYING -> {
                // TODO("再生停止")
                System.out.println("再生停止")

                // TODO("録画開始")
                System.out.println("録画開始")
            }
            State.RECORDING -> {}
        }
        state = State.RECORDING
    }

    private fun eventStopButton() {
        when (state) {
            State.IDLE -> {}
            State.PLAYING -> {
                // TODO("再生停止")
                System.out.println("再生停止")
            }
            State.RECORDING -> {
                // TODO("録画停止")
                System.out.println("録画停止")
            }
        }
        state = State.IDLE
    }
}