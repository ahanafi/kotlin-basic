fun main(args: Array<String>) {
    //Mutable variable => Can change the value of variable after the definition
    var Nama = "Al Hanif"
    var Age  = 20

    //Immutable => Could'nt change the value of the variable
    //When trying to change, code will error, usually define by VAL
    val Address = "Cirebon, West Java"
    var isMarried = false
    var NumberPhones = 83824055826

    Nama = "Ahmad Hanafi" //Change value of variable
    print("My Name is "+ Nama +" I am "+Age+" years old.\n Is Married : "+ isMarried + " My phone number is "+ NumberPhones)
}