fun main(){ 
    val num = arrayOf(1,2,3,4,5) //without data type
    val words:Array<String> = arrayOf("abc","def") //with data type
    
    //multiple of 2:
    val squares = Array(5) { i -> i * i } 
    // val name = initializing as Array {contains condition}
    // -> is called lambda function
    
    println(num.contentToString())
    println(words.contentToString())
    println(squares.contentToString())
    
     println("\n")
    //accessing elements with index number
    val first = num[0]
    val sec = words[1]
    println(first)
    println(sec)
    
    println("First Number in array is $first")
    println("Second word in array is $sec")
    
     println("\n")
    //modifying element
    num[0]=10
    words[1]="Kotlin"
    println("Modified first number: ${num[0]}")
    println("Modified sec word: ${words[1]}")
    
    println("\n")


}
