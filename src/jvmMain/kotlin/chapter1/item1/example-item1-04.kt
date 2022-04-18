class Example_Item1_04 {

val name: String? = "Marton"
val surname: String = "Braun"

val fullName: String?
    get() = name?.let { "$it $surname" }

val fullName2: String? = name?.let { "$it $surname" }

fun main() {
    if (fullName != null) {
//        print(fullName.length) // Error
    }

    if (fullName2 != null) {
        print(fullName2.length) // 12
    }
}
}

fun main() {
    Example_Item1_04().main()
}