package linkedList

import javax.print.attribute.IntegerSyntax

class DoubleLinkedObject(
    override var key: Int,
    override var next: Linkable? = null,
    override var prev: Linkable? = null,
    var satData: String = ""
) : Linkable {


    fun key() = key
    override fun next(): Linkable? = next

    override fun prev(): Linkable? = prev
}
