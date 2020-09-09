package com.example.newemployeeissues

interface StateBase {
    var state : State

    fun inAction() // 状態に入った時のアクション
    fun endAction() // 状態を抜けるときのアクション
}