fun main() {
    var bal = 1000
    var wd: Int
    var cont: String

    do {
        println("Your current balance is: $bal")
        print("Enter the amount you want to withdraw: ")
        
        wd = readLine()?.toIntOrNull() ?: 0  // Safely handle input as an integer
        
        if (wd <= bal) {
            bal -= wd
            println("Withdrawal successful! New balance = $bal")
        } else {
            println("Insufficient balance.")
        }
        
        print("Do you want to make another withdrawal? (yes/no): ")
        cont = readLine()?.lowercase() ?: "no"  // Safely handle user input
        
    } while (cont == "yes")

    println("Thank you!")
}
