fun cnvrtToFahrenheit(temp: Double): Double {
    // Function to convert temperature from Celsius to Fahrenheit
    // °F = °C × (9/5) + 32.
    return temp * (9 / 5.0) + 32
}

fun cnvrtToCelsius(temp: Double): Double {
    // Function to convert temperature from Fahrenheit to Celsius
    // °C = (°F - 32) × (5/9)
    return (temp - 32) * (5 / 9.0)
}

fun main(args: Array<String>) {
    val celsiusTemp = 25.0
    val fahrenheitTemp = cnvrtToFahrenheit(celsiusTemp)
    println("$celsiusTemp°C is equal to $fahrenheitTemp°F")
    
    val fahrenheitInput = 77.0
    val celsiusOutput = cnvrtToCelsius(fahrenheitInput)
    println("$fahrenheitInput°F is equal to $celsiusOutput°C")
}
