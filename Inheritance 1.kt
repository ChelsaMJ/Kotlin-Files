open class Rectangle(val a: Double, val b: Double) {
    
    fun area(): Double {
        return a * b
    }
    
    open fun display() {
        println("Area of rectangle with dimensions $a * $b is ${area()}")
    }
}

class Square(side: Double) : Rectangle(side, side) {
    
    override fun display() {
        println("Area of square with side $a is ${area()}")
    }
}

fun main() {
    val myRec = Rectangle(4.0, 5.0)
    myRec.display()
    
    val mySq = Square(3.0)
    mySq.display()
}
