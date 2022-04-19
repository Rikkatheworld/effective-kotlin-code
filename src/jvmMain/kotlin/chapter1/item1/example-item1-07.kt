package chapter1.item1

class Example_Item1_07 {
    data class User(
        val name: String,
        val surname: String
    )

    fun main() {
        var user = User("Maja", "Markiewicz")
        user = user.copy(surname = "Moskala")
        print(user)  // User(name=Maja, surname=Moskala)
    }
}