data class User(val id: Long, var name: String)

fun main() {

    val user1 = User(1, "Denis")

    user1.name = "michael"
    val user2 = User(1, "Michael")

    println(user1 == user2)
    println("User details: $user1")
    val updatedUser = user1.copy(name="Denis panjuta")

    
}