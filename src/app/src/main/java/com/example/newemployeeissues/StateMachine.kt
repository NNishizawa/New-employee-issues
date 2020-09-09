package com.example.newemployeeissues

class StateMachine(stateList: List<StateBase>) {
    private val stateMap = mutableMapOf<State, StateBase>()
    private var currentState: State

    init {
        // 初期化
        stateList.forEach {
            stateMap.put(it.state, it)
        }

        currentState = stateList.get(0).state
        stateMap[currentState]?.inAction()
    }

    fun setState(state: State) {
        if (currentState != state) {
            stateMap[currentState]?.endAction()
            stateMap[state]?.inAction()
            currentState = state
        }
    }
}