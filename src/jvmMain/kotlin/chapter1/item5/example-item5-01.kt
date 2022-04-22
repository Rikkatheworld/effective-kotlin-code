package chapter1.item5

import java.awt.Point
import java.util.*

class Example_item5_01 {

//    fun <T> pop(num: Int = 1): List<T> {
//        require(num <= size) {
//            "Cannot remove more elements than current size"
//        }
//        check(isOpen) { "Cannot pop from closed stack" }
//        val ret = collection.take(num)
//        collection = collection.drop(num)
//        assert(ret.size == num)
//        return ret
//    }

    fun factorial(n: Int): Long {
        require(n >= 0) {
            "Cannot calculate factorial of $n because it is smaller than 0"
        }
        return if (n <= 1) 1 else factorial(n - 1) * n
    }

//    fun findClusters(points: List<Point>): List<Cluster>{
//        require(points.isNotEmpty())
//         ..
//    }

//    fun sendEmail(user: User, message: String) {
//        requireNotNull(user.email)
//        require(isValidEmail(user.email))
//    }

//    fun speak(text: String) {
//        check(isInitialized)
//        // ...
//    }
//
//    fun getUserInfo(): UserINfo {
//        checkNotNull(token)
//        // ...
//    }
//
//    fun next(): T {
//        check(isOpen)
//    }


}