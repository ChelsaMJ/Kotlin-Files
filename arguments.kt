
    //default arguments
    fun sum(a:Int =10, b:Int=20){
        val c=a+b
        println(c)
    }
    fun main(){
        sum(20,50)
        sum()
    }
    
    
    //without default arguments
    fun sum(a:Int, b:Int){
        val c=a+b
        println(c)
    }
    fun main(){
        sum(20,50)
        sum() //gives errors
    }
    
