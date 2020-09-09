package com.example.newemployeeissues

class StateIdle: StateBase{

    override var state: State = State.IDLE

    override fun inAction() {}

    override fun endAction() {}
}