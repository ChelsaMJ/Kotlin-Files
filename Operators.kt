fun main(){
    var a=10
    var b=20
    
    val add = a+b
    val sub = a-b
    val mul = a*b
    val div = b/a
    val mod = b%a
    
    //arithmetic op
    println("Addition: $a+$b=$add")
    println("sub: $a-$b=$sub")
    println("Muliplication: $a*$b=${a*b} or $mul")
    println("div: $b/$a=$div")
    println("modulus: $b%$a=$mod")
    
    println('\n')
    //relational op
    val isTrue = true
    val isFalse = false
    
    val isEqual= a==b
    val isLess= a<b
    val isGreat= a>b
    val isNotEqual= a!=b
    println(isEqual)
    println(isLess)
    println(a<=b)
    println(isGreat)
    println(a>=b)
    println(isNotEqual)
    
    
    println('\n')
    //assignment op
    var x=10
    var c=10
    x+=c
    println("added c: $x")
    x-=c
    println("subtracted c: $x")
    x*=c
    println("multiplied with c: $x")
    x/=c
    println("divided with c: $x")
    x%=c
    println("modulus: $x")
 
    
    println('\n')
    //unary op
    var y:Int =10
    var d= ++y
    var e= --y
    var f= +y
    var g= -y
    
//     var h= !y
    println("incremented y: $d")
    println("decremented y: $e")
    println("unary plus :$f")
    println("unary minus: $g")
//     println(h)

    val isTrue = true
    println("Unary plus of $a = ${+a}")
    println("Unary minus of $b = ${-b}")
    println("Increment of $a = ${++a}")
    println("Decrement of $b = ${--b}")
    println("${!isTrue}")
   
    println('\n')
    //logical
    
    println('\n')
    //bitwise op
    
}
