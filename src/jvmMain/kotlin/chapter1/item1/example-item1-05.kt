package chapter1.item1

class Example_Item1_05 {

    inline fun <T, R> Iterable<T>.map(transformation: (T) -> R): List<R> {
        val list = ArrayList<R>()
        for (elem in this) {
            list.add(transformation(elem))
        }
        return list
    }

    fun immutableList1() {
        val list = listOf(1, 2, 3)

        // 千万不要这么做
        if (list is MutableList) {
            list.add(4)
        }
    }
}

fun main() {
    Example_Item1_05().immutableList1()
}