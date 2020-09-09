package com.example.newemployeeissues

class PersonFemale( override val name: String, val height: Int ) : PersonBase(name, Gender.FEMALE) {
    override fun show(id: Int): String {
        return "$id $name ${gender.dispName} ${height}cm"
    }
}