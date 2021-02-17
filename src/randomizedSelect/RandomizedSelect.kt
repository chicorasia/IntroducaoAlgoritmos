package randomizedSelect

import quicksort.Quicksort

class RandomizedSelect {

    fun randomizedSelect(A: IntArray, inicio: Int, termino: Int, iEsimo: Int) : Int {

        if (inicio == termino) return A[inicio]

        val meio = Quicksort.randomizedPartition(A, inicio, termino)
        val numeroElementosNoSubArray = meio - inicio + 1

        when{
            iEsimo == numeroElementosNoSubArray -> return A[meio]
            iEsimo < numeroElementosNoSubArray -> return randomizedSelect(A, inicio, meio - 1, iEsimo)
            else -> return randomizedSelect(A, meio + 1, termino, iEsimo - numeroElementosNoSubArray)
        }

    }
}