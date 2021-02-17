package minimumMaximum

class MinimumMaximum {

    fun minimum(A: IntArray): Int{

        var min = A[0]
        for (i in 1 until A.size){
            if (min > A[i]) min = A[i]
        }
        return min
    }

    fun maximum(A: IntArray): Int{

        var max = A[0]
        for (i in 1 until A.size){
            if (max < A[i]) max = A[i]
        }
        return max
    }

    fun minimumAndMaximum(A: IntArray) : IntArray {

        //se A.size for PAR
        if (A.size % 2 == 0) {
            var min = minimum(intArrayOf(A[0], A[1]))
            var max = maximum(intArrayOf(A[0], A[1]))

            for (i in 2 until A.size - 1) {
                if (A[i] > A[i + 1]) {
                    if (max < A[i]) max = A[i]
                    if (min > A[i + 1]) min = A[i + 1]
                } else {
                    if (min > A[i]) min = A[i]
                    if (max < A[i + 1]) max = A[i + 1]
                }
            }
            return intArrayOf(min, max)
        }


        var min = A[0]
        var max = A[0]

        for (i in 0 until A.size - 1) {
            if (A[i] > A[i + 1]) {
                if (max < A[i]) max = A[i]
                if (min > A[i + 1]) min = A[i + 1]
            } else {
                if (min > A[i]) min = A[i]
                if (max < A[i + 1]) max = A[i + 1]
            }
        }
        return intArrayOf(min, max)

    }

}