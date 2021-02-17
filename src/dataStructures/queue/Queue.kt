package dataStructures.queue

class Queue(capacidade: Int) {

    var head: Int = 0
        private set
    var tail: Int = 0
        private set
    var array: Array<Int?> = arrayOfNulls<Int>(capacidade)


    fun enqueue(x: Int) {

        if (queueFull()) {
            throw IllegalStateException("Queue overflow")
        }

        //pre-checks tail to avoid ArrayIndexOutOfBounds exception
        if (tail == array.size) {
            tail = 0
        }
        array[tail] = x
        tail++

    }

    fun enqueue(Q: Queue, x: Int) {
        Q.enqueue(x)
    }

    fun dequeue(): Int? {

        if (queueEmpty()){
            throw IllegalStateException("Queue underflow")
        }

        val x = array[head]
        array[head] = null
        if (head == array.lastIndex){
            head = 0
        } else head++
        return x
    }

    private fun queueFull() = tail + 1 == head || (tail == array.size && head == 0)
    private fun queueEmpty() = head == tail

    fun dequeue(Q: Queue): Int? {
        return Q.dequeue()
    }


}