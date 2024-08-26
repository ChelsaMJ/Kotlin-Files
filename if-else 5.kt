fun main() {


    val age=15
    if(age<13)
    {
        println("Child")
    }
    else if(age in 13.. 19) //using .. for range
    {
        println("Teenager")
    }
    else if(age in 20.. 64) //using ..
    {
        println("Adult")
    }
    else
    {
        println("Senior")
    }
    
}
