fun main(args: Array<String>) {
    //Numbers
    println("1) NUMBERS")
    val a: Int = 10000
    val d: Double = 100.00
    val f: Float = 100.00f
    val l: Long = 10000000004
    val s: Short = 10
    val b: Byte = 1

    println("Value Integer => "+a)
    println("Value Double => "+d)
    println("Value Float => "+f)
    println("Value Long => "+l)
    println("Value Short => "+s)
    println("Value Byte => "+b)

    //Characters
    println("2) CHARACTER")
    val key: Char = 'a'
    println("$key")

    //Boolean (TRUE or FALSE)
    println("3) BOOLEAN")
    val theStatement = false
    println("$theStatement")

    //Strings
    println("4) STRINGS")
    val address = "Cirebon, West Java"
    //String with more than one line
    val greetings = """Hello, User
    Welcome to the Kotlin Class
    """
    println("$address")
    println(greetings)

    //Arrays
    println("5) ARRAY")
    val numbers: IntArray = intArrayOf(1,2,3,4,5,6,7,8,9)
    println("Hy, "+numbers[4]+" is come from array variables")
}