package chapter1.item1

import kotlin.concurrent.thread
import kotlin.properties.Delegates

class Example_Item1_08 {

    val list1: MutableList<Int> = mutableListOf()
    var list2: List<Int> = listOf()

    fun main1() {
        list1.add(1)
        list2 = list2 + 1

        list1 += 1
        list2 += 1
    }

    fun main2() {
        var list = listOf<Int>()
        for (i in 1..1000) {
            thread {
                list += i
            }
        }
        Thread.sleep(1000)
        print(list.size) // 大概率不是 1000, 每一次都是不同的值
    }

    var names by Delegates.observable(listOf<String>()) { _, old, new ->
        print("Names changed from $old to $new")
    }

    var annoucements = listOf<Int>()
        private set

    fun main3() {
        annoucements += 1
        names += "Fabio"
        // Names changed from [] to [Fabio]
        names += "Bill"
        // Names changed from [Fabio] to [Fabio, Bill]
    }
}

fun main() {
    Example_Item1_08().main3()
}