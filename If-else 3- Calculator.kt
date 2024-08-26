fun main() {
   // construct calculator using if-else for all arithmatic operator
    
    var a=10
    var b=20
//     op=plus,minus,multiply,divide
    val op = "multiply"
    
    if(op=="plus")
    {
        println("Addition: ${a+b}")
    }
    else if(op=="minus")
    {
        println("Subtraction: ${a-b}")
    }
    else if(op=="multiply")
    {
        println("Multiplication: ${a*b}")    }
    else
    {
        println("Divition: ${a/b}")
    }
    
}
