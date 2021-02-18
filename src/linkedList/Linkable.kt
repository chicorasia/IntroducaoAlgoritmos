package linkedList

interface Linkable {

    var key: Int
    var next: Linkable?
    var prev: Linkable?


    fun next(): Linkable?

    fun prev(): Linkable?

}