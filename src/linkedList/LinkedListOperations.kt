package linkedList

fun main(){

    val objeto01 = DoubleLinkedObject(
        key = 111,
        prev = null,
        next = null,
        satData = "Eu sou o primeiro objeto!"
    )

    val objeto02 = DoubleLinkedObject(
        key = 222,
        prev = null,
        next = null,
        satData = "Eu sou o segundo objeto"
    )

    objeto02.prev = objeto01.also { objeto01.next = objeto02 }

    var objeto03 = DoubleLinkedObject(
        key = 333,
        prev = null,
        next = null,
        satData = "Eu sou o terceiro objeto"
    )

    objeto02.next = objeto03
    val objeto04 = DoubleLinkedObject(key = 444, satData = "Sou o quarto objeto")

    val linkedList = DoubleLinkedList(null)
    linkedList.listInsert(objeto04)
    linkedList.listInsert(objeto01)
    linkedList.listInsert(objeto02)
    linkedList.listInsert(objeto03)

    linkedList.listDelete(objeto04)

    linkedList.listAll().forEach { it ->
        it as DoubleLinkedObject
        println(it.satData)
    }

   println(linkedList.listSearch(444)?.satData ?: "Item não encontrado")

}