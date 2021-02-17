package bubblesort_kotlin

fun main(){

    val array = intArrayOf(10,20,50,40,60,70,30,80)

    BubbleSortKt.sort(array)

    var list = mutableListOf(4,6,2,3,7,9,5,8)

    for(item in array)
        print("$item, ")

    val evens = list.filter { it % 2 == 0 }
    val odds = list.filter { it % 2 == 1}

    println()

    for(calopsita in evens)
        print("$calopsita, ")

    println()

    for(jabuticaba in odds)
        print("$jabuticaba, ")

    println()
    println(list)
    list[3] = 8
    println(list)

    println(theAnswer())


}

fun theAnswer() = 42



