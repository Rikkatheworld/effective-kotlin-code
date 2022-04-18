import com.sun.org.apache.xpath.internal.operations.Bool

class Example_Item1_03 {
    fun main() {
        readOnlyProper3()
    }

    fun readOnlyProper1() {
        val list = mutableListOf(1, 2, 3)
        list.add(4)

        print(list) // [1, 2, 3, 4]
    }

    var name: String = "Marcin"
    var surname: String = "Moskla"
    val fullName
        get() = "$name $surname"

    fun readOnlyProper2() {
        print(fullName) // Marcin Moskala
        name = "Maja"
        print(fullName) // Maja Moskala
    }

    fun calculate(): Int {
        print("Calculating...")
        return 42
    }

    val fizz = calculate() // Calculating...
    val buzz
        get() = calculate()

    fun readOnlyProper3() {
        print(fizz) // 42
        print(fizz) // 42
        print(buzz) // Calculating... 42
        print(buzz) // Calculating... 42
    }

    private interface Element {
        val active: Boolean
    }

    private class ActualElement : Element {
        override var active: Boolean = false
    }
}