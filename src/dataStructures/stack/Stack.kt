package dataStructures.stack

import com.sun.org.apache.xpath.internal.operations.Bool

class Stack {
    var top: Int = -1
        private set
    val list: MutableList<Int> = mutableListOf()


    fun stackEmpty(): Boolean{
        return (top == -1)
    }

    fun stackEmpty(S: Stack): Boolean{
        return S.stackEmpty()
    }

    fun push(x:Int){
        this.top++
        this.list.add(top, x)
    }

    fun push(S: Stack, x: Int){
        S.push(x)
    }

    fun pop(): Int {
        when (this.stackEmpty()){
            true -> throw IllegalStateException("Stack underflow")
            false -> {
                this.top--
                val value = this.list[top + 1]
                this.list.removeAt(top + 1)
                return value
            }
        }
    }

    fun pop(S: Stack, x: Int): Int{
        return S.pop()
    }

    fun peek(): Int {
       if(!stackEmpty()){
           return this.list[top]
       } else {
           throw IllegalStateException("Stack is empty")
       }
    }

    fun peek(S: Stack): Int{
        return S.peek()
    }

}

