fun main(args: Array<String>) {

    var samsung = MobilePhone("Android", "Samsung", "S")
    samsung.stateRam()
    var iphone = MobilePhone("ios", "Apple", "iphone 7")
    iphone.ram = 3
    iphone.stateRam()
}

class MobilePhone(osName: String, brand: String, model: String) {

    var ram: Int = 4
    var yor: Int? = null
    // Primary constructor
    init {
        println("The phone $model from $brand used $osName as its operating system")
    }

        // Secondary constructors


    fun stateRam() {
        println("This device has $ram GB ram.")
    }
}