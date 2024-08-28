fun cnvrt(temp:Double):Double {
    //function to convert temperature from celcius to fahrenheit
//     °F = °C × (9/5) + 32.
    var t = temp*(9/5.0)+32
    return t
}

fun main(args: Array<String>){
    
    var temp=25.0
    var f:Double =cnvrt(temp)
    println(f)
    
}
