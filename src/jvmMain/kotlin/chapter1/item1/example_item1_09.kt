package chapter1.item1

class Example_Item1_09 {

    data class User(val name: String)

    class UserRepository {
        private val storedUsers: MutableMap<Int, String> = mutableMapOf()

        fun loadAll(): Map<Int, String> {
            return storedUsers
        }
    }

    class UserRepositoryMutable {
        private val storedUsers: MutableMap<Int, String> = mutableMapOf()

        fun loadAll(): MutableMap<Int, String> {
            return storedUsers
        }
    }

    fun main1() {
        val userRepository = UserRepositoryMutable()

        val storedUsers = userRepository.loadAll()
        storedUsers[4] = "Kirill"
    }

    data class MutableUser(val name: String = "AAA")

    class UserHolder {
        private val user: MutableUser = MutableUser()

        fun get(): MutableUser {
            return user.copy()
        }
    }
}
