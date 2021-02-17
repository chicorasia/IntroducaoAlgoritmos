package randomizedSelect

fun main(){

    var array = intArrayOf(28, 30, 15, 8, 26, 45, 7, 12, 11, 13, 87)

    val iEsimo = RandomizedSelect()
        .randomizedSelect(array, 0, array.size - 1, 1)

    for (item in array)
        print("$item, ")

    println()
    println(iEsimo)

}