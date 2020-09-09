package com.example.newemployeeissues

class Window {
    val windowStack = WindowStack()

    fun onCreateWindow(window: Window) {
        windowStack.push(window)
    }

    fun onDestroyWindow(){
        windowStack.pop()
    }

    fun getTopWindow(): Window {
        return windowStack.top()
    }
}