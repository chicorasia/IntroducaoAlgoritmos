package bubblesort_kotlin

abstract class BubbleSortKt {

    companion object{

        fun sort(A: IntArray) {

            for(i in 0 until A.size){
                for(j in A.size - 1 downTo i + 1)
                    if(A[j] < A[j-1]){
                        A[j] = A[j-1].also{
                            A[j-1] = A[j]
                        }
                    }
            }
        }

        fun reverseSort(A: IntArray){

        }
    }
}