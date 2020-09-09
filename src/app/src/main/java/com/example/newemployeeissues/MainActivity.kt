package com.example.newemployeeissues

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val stateMachine = StateMachine(listOf(StateIdle(), StatePlaying(), StateRecording()))

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
            Event.BUTTON_PLAY -> { stateMachine.setState(State.PLAYING) }
            Event.BUTTON_RECORD -> { stateMachine.setState(State.RECORDING) }
            Event.BUTTON_STOP -> { stateMachine.setState(State.IDLE) }
        }
    }
}