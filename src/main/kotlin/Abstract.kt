import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction
import kotlin.math.max

abstract class Mammal(private val name: String, private val origin: String,
                      private val weight: Double) {

    abstract var maxSpeed: Double
    abstract fun run()
    abstract fun breath()

    fun displayDetails() {
        println("Name: $name, Origin: $origin, Weight: $weight, "+
        "Max speed: $maxSpeed")
    }
}

class Human(name: String, origin: String, weight: Double,
            override var maxSpeed: Double): Mammal(name, origin, weight) {
    override fun run() {
                    println("Runs on the legs")
                }

    override fun breath() {
        println("Breaths via nose and mouth")
    }
            }

fun main() {
    val human = Human("Denis", "Russia", 65.0, 28.0)

    human.displayDetails()
    human.run()


}