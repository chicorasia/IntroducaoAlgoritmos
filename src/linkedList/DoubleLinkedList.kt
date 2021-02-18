package linkedList

import kotlin.streams.toList

class DoubleLinkedList(
    var head: Linkable? = null,
    var set: MutableSet<Linkable> = mutableSetOf(),
) {

    fun listSearch(k: Int) : DoubleLinkedObject? {
        var x = head
        while (x != null && x.key != k){
            x = x.next
        }
        return x as? DoubleLinkedObject
    }

    fun listInsert(x: Linkable){
        set.add(x)
        x.next = head
        if (head != null){
            head?.prev = x
        }
        head = x
        x.prev = null
    }

    fun listAll(): List<Linkable>{
        return set.stream().toList()
    }

    fun get(i: Int): Linkable? {
        var x = head
        var j = 0
        if(i == 0) return x

        while(j < i + 1){
            x = x?.next
            j++
        }
        return x
    }

    fun listDelete(x: Linkable){
        if (x.prev != null){
            x.prev?.next = x.next
        } else {
            this.head = x.next
        }

        if (x.next != null){
            x.next?.prev = x.prev
        }

    }


}
