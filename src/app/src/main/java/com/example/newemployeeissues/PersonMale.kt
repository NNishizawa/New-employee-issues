package com.example.newemployeeissues

class PersonMale( override val name: String, val bodyWeight: Int ) : PersonBase(name, Gender.MALE) {
    override fun show(id: Int): String {
        return "$id $name ${gender.dispName} ${bodyWeight}kg"
    }
}