package minimumMaximum

import kotlin.random.Random

fun main() {

//    val array = intArrayOf(10, 54, 2, 7, 32, 45, 92, 99, 8, -8, 87, 655, 102)

    val TAMANHO_DA_AMOSTRA = 200000

    var array = IntArray(TAMANHO_DA_AMOSTRA)

    for (i in 0 until TAMANHO_DA_AMOSTRA){
        array[i] = Random.nextInt(1000)
    }


    println("Minimum: ${MinimumMaximum().minimum(array)}")
    println("Maximum: ${MinimumMaximum().maximum(array)}")

    val startTime = System.currentTimeMillis()
    for(item in MinimumMaximum().minimumAndMaximum(array)){
        println(item)
    }
    val endTime = System.currentTimeMillis()
    val tempoTotal = endTime - startTime
    println("Tempo de execuçao: $tempoTotal ms para $TAMANHO_DA_AMOSTRA elementos")

}