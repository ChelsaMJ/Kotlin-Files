fun main() {
    // Create a 3D array using arrayOf
    val array3D = arrayOf(
        arrayOf(
            intArrayOf(1, 2, 3),
            intArrayOf(4, 5, 6),
            intArrayOf(7, 8, 9)
        ),
        arrayOf(
            intArrayOf(10, 11, 12),
            intArrayOf(13, 14, 15),
            intArrayOf(16, 17, 18)
        )
    )

    // Printing the whole array
    for (matrix2D in array3D) {
        for (row in matrix2D) {
            for (element in row) {
                print("$element ")
            }
            println()
        }
        println()
    }
}
