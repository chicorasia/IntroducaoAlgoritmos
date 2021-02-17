package dataStructures.stack

fun main() {

    var stack = Stack()

    stack.push( 99)
    stack.push( 65)
    stack.push( 44)

    println(stack.stackEmpty())

    for (item in stack.list) {
        print("$item, ")
    }

    println()
    println("popping: ${stack.pop()}")
    println("peeking: ${stack.peek()} is top of the stack")
    println("popping: ${stack.pop()}")
    println("pushing: 33")
    stack.push(33)
    println("popping: ${stack.pop()}")
    println("****")


    for (item in stack.list) {
        print("$item, ")
    }
}