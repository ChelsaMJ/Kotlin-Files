fun cnvrt(temp:Double):Double {
    //function to convert temperature from celcius to fahrenheit
//     °F = °C × (9/5) + 32.
    val t = temp*(9/5.0)+32
    return t
}

fun main(args: Array<String>){
    
    val temp=25.0
    val f:Double =cnvrt(temp)
    println(f)
    
}
