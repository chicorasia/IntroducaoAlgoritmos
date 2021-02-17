package bucketsort

class BucketSort {

    companion object {

        fun sort(A: DoubleArray, print: Boolean = false): DoubleArray{

            val n = A.size
            val B = arrayOfNulls<MutableList<Double>>(n)

            for (i in A.indices) {
                B[i] = mutableListOf()
            }

            for (i in B.indices) {
                B[(n * A[i]).toInt()]?.add(A[i])
            }

            for (i in B.indices){
                B[i]?.sort()
            }

            var C = doubleArrayOf()
            for (i in B.indices){
                if(print == true) printBucket(i, B)
                C += B[i].orEmpty()
            }

            return C


        }

        private fun printBucket(i: Int, B: Array<MutableList<Double>?>) {
            print("Bucket $i: ")
            for (item in B[i].orEmpty())
                print("$item, ")
            println()
        }
    }



}