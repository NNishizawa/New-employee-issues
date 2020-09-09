package com.example.newemployeeissues

class StatePlaying : StateBase {

    override var state: State = State.PLAYING

    override fun inAction() {
        // TODO("再生開始")
        System.out.println("再生開始")
    }

    override fun endAction() {
        // TODO("再生停止")
        System.out.println("再生停止")
    }
}