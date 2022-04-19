package chapter1.item2

class Example_Item2_02 {

    fun main1() {
var numbers = (2..100).toList()
val primes = mutableListOf<Int>()
while (numbers.isNotEmpty()) {
    val prime = numbers.first()
    primes.add(prime)
    numbers = numbers.filter { it % prime != 0 }
}
print(primes) // [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31,
// 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97]
    }
}

fun main() {
    Example_Item2_02().main1()
}