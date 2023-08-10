open class Car (val name: String, val brand: String){
    open var range: Double = 0.0

    open fun extendRange(amount: Double){
        if(amount > 0) range += amount
    }
    open fun drive(distance: Double){
        println("Drove for $distance KM.")
    }
}

class ElectricCar(name: String, brand: String, batteryLife: Double) : Car(name, brand){
    override var range = batteryLife * 6
    var batteryType: String = "Type 1"

    override fun drive(distance: Double) {
        println("Drove for $distance KM on electricity")
    }

    fun drive() {
        println("Drove for $range KM on electricity")
    }

}

fun main() {
    var myCar = Car("A3", "Audi")
    var myElectricCar = ElectricCar("Model S", "Tesla", 85.0)

    myElectricCar.extendRange(200.0)
    myElectricCar.batteryType = "Type2"

    myCar.drive(200.0)
    myElectricCar.drive(200.0)
    myElectricCar.drive()
}