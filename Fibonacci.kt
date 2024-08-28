fun fibonacci(n: Int): Int {
    return if (n <= 1) n else fibonacci(n - 1) + fibonacci(n - 2)
}

fun main() {
    println("Enter number:")
    val y: Int = readln().toInt()
    val x = fibonacci(y)
    println("Fibonacci($y) = $x")
}
