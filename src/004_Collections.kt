fun main(args: Array<String>) {
    //This is can change the item
    val numbers: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)

    //This is can't change the item
    val readOnly: List<Int> = numbers

    println("My immutable list : "+numbers)
    numbers.add(6)
    numbers.add(7)
    println("My immutable list after add 2 item : "+numbers)
}