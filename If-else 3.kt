fun main() {
   // construct calculator using if-else for all arithmatic operator
    
    var a=20
    var b=10
//     op=plus,minus,multiply,divide
    val op = "divide"
    
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
    else if(op=="divide")
    {
        if(b!=0){
            println("Division: ${a/b}")
        }
        else
        {
            println("Error: divistion by zero")
        }
    }
    else{
        println("Error: unsupported operator")
    }
    
}
