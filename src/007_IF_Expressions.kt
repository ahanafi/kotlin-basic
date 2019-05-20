fun main(args: Array<String>) {
    val  number = -10

    if (number > 0) {
        println("The number is positive")
    } else {
        println("The number is negative")
    }

    //Use if as expressions
    val result = if(number > 0) {
        "Positive NUmber"
    } else {
        "Negative Number"
    }

    println("$result")
}