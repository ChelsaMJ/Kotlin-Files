fun fact(n:Int):Int{
    return if(n<=1)1 else n*fact(n-1)
}

fun main(){
    println("Enter number:")
    var y:Int=readln().toInt() 
    var x=fact(y)
    println(x)
}
