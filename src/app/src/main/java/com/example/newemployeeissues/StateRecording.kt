package com.example.newemployeeissues

class StateRecording: StateBase {
    override var state: State = State.RECORDING

    override fun inAction() {
        TODO("録画開始")
    }

    override fun endAction() {
        TODO("録画停止")
    }
}