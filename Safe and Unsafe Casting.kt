fun main(){ 
    val a = "hi"
    val b:String = a as String
    println("Unsafe casting result: $b") //successful
    
    println("\n")
    
//     val c:Int = a as Int
//     println("Unsafe casting result: $c") //gives ClassCastException
    
    val c:Int? = a as? Int
    println("Unsafe casting result: $c") //no error of ClassCastException
    
    

}
