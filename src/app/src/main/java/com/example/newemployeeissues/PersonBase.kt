package com.example.newemployeeissues

abstract class PersonBase(open val name: String, val gender: Gender) {
    abstract fun show(id: Int): String
}