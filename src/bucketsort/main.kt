package bucketsort

import kotlin.math.roundToLong
import kotlin.random.Random
import kotlin.random.Random.Default.nextDouble

fun main(){

    val TAMANHO_DA_AMOSTRA = 20

    var array = DoubleArray(TAMANHO_DA_AMOSTRA)

    for (i in 0 until TAMANHO_DA_AMOSTRA){
        array[i] = Random.nextDouble()
    }

//    var array = doubleArrayOf(.79, .13, .16, .64, .39, .20, .89, .53, .71, .42, .25, .13)

    var sortedArray = BucketSort.sort(array)

    for (item in sortedArray){
        print("$item, ")
    }

}