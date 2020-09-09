package com.example.newemployeeissues

class Node(val name:String) {
    val childlist : MutableList<Node> = mutableListOf()

    fun show(deep:Int = 0) {
        // 空白を作成する
        var spaceBuffer : StringBuffer = StringBuffer()
        for(i in 0 until deep) {
            spaceBuffer.append("　")
        }

        var space : String = spaceBuffer.toString()
        System.out.println("$deep$space$name")
        childlist.forEach {it.show(deep + 1)}
    }

    fun find(findName: String, deep: Int = 0):Node? {
        if(findName.equals(name)){
            return this
        }

        childlist.forEach {
            var result : Node?
            result = it.find(findName, deep + 1)
            if(result != null) {
                return result
            }
        }

        return null
    }
}