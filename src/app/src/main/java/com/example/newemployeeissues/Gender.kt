package com.example.newemployeeissues

enum class Gender(val dispName: String) {
    MALE("男") {
        override fun show(idx: Int, data: PersonBase) {
            (data as PersonMale)?.let {
                System.out.println("$idx ${it.name} $dispName ${it.bodyWeight}kg")
            }
        }
    },
    FEMALE("女") {
        override fun show(idx: Int, data: PersonBase) {
            (data as PersonFemale)?.let {
                System.out.println("$idx ${it.name} $dispName ${it.height}cm")
            }
        }
    };

    abstract fun show(idx: Int, data: PersonBase)
}