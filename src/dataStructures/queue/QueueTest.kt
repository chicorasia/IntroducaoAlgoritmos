package dataStructures.queue

fun main(){

    val queue = Queue(4)

    queue.enqueue(10)
    println("head: ${queue.head}, tail ${queue.tail}")
    queue.enqueue(20)
    println("head: ${queue.head}, tail ${queue.tail}")
    queue.enqueue(40)
    println("head: ${queue.head}, tail ${queue.tail}")
    queue.enqueue(60)
    println("head: ${queue.head}, tail ${queue.tail}")



    queue.array.forEach { it ->
        print("$it, ")
    }

    queue.dequeue()
    queue.dequeue()
    queue.enqueue(80)
    queue.dequeue()
    queue.dequeue()
    queue.dequeue()
    queue.enqueue(120)
//    queue.dequeue()

    println()
    queue.array.forEach { it ->
        print("$it, ")
    }



    println("head: ${queue.head}, tail ${queue.tail}")
//
//    queue.array.forEach { it ->
//        print("$it, ")
//    }

}