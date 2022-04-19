import java.awt.Color

class Example_Item2_01 {
    val a = 1
    fun fizz() {
        val b = 2
        print(a + b)
    }

    val buzz = {
        val c = 3
        print(a + c)
    }

    data class User(val name: String)

    fun main1() {
        val users = listOf<User>()

        // Bad
        var user: User
        for (i in users.indices) {
            user = users[i]
            print("User at $i is $user")
        }

        // Better
        for (i in users.indices) {
            val user = users[i]
            print("User at $i is $user")
        }

        // 相同变量作用域下，更好的语法使用
        for ((i, user) in users.withIndex()) {
            print("User at $i is $user")
        }
    }

    val hasValue = false

    fun getValue(): User = User("aaa")

    fun main2() {
        // 不好的写法
        val user: User
        if (hasValue) {
            user = getValue()
        } else {
            user = User("bbb")
        }
    }

    fun main3() {
        // 好的写法
        val user: User = if (hasValue) {
            getValue()
        } else {
            User("bbb")
        }
    }

    // 不好的写法
    fun updateWeatherBad(degrees: Int) {
        val description: String
        val color: Color
        if (degrees < 5) {
            description = "cold"
            color = Color.BLUE
        } else if (degrees < 23) {
            description = "mid"
            color = Color.YELLOW
        } else {
            description = "hot"
            color = Color.RED
        }
    }

    // 好的写法
    fun updateWeatherBetter(degrees: Int) {
        val (description, color) = when {
            degrees < 5 -> "cold" to Color.BLUE
            degrees < 23 -> "mid" to Color.YELLOW
            else -> "hot" to Color.RED
        }
    }
}