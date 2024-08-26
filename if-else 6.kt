fun main() {
    
    val dayofweek = 3
    val dayname = when (dayofweek){
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day"
    }
    
    println("Day of the week: $dayname")
    
}
