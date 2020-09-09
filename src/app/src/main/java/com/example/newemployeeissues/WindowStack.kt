package com.example.newemployeeissues

class WindowStack {
    val stack: MutableList<Window> = mutableListOf()

    fun push(window: Window) {
        stack.add(window)
    }

    fun pop() {
        stack.removeAt(stack.size - 1)
    }

    fun top(): Window {
        return stack.get(stack.size - 1)
    }
}