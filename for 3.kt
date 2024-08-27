fun main() {
 
    var lst=listOf("a","b","c")
    //elements
    for(i in lst){
        println(i)
    }
    
    println('\n')
    //elements with indices
    for(i in lst.indices){
        println(lst[i])
    }
}
