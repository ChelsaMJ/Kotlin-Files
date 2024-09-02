class person(
    var name:String,
    var age:Int){
    
    constructor(x:String):this(){
        this.name=x
        this.age=0
    }
    
    constructor():this("Rahul",50)
    

    fun intro(){
        println("My name is $name and my age is $age")
    }
}

fun main() {
    var a=person("Riya",22)
    a.intro()
    var b=person()
    b.intro()
    var c=person("Heena")
    c.intro()}
