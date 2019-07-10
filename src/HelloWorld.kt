package practice.kotlin.pair

fun main(args: Array<String>) {
    println("Hello, World!")
    val (two, three) = tupleExample(5)
    println("items are $two and $three")
    var sum = arraySum(arrayOf(1,2,3,4,5,6))
    println("sum is $sum")

    var sumNum = sumNum(1,2,3,4,5,6,7)
    println("sum is $sumNum")

    var multiply = {num1: Int, num2: Int -> num1 * num2}
    println("multiplication is ${multiply(5,3)}")

    var factorial = fact(9)
    println("factorial is $factorial")

    var numList = 1..20
    var evenList = numList.filter{ n -> n % 2 == 0}
    for (i in evenList) {
        println(i)
    }
}

fun tupleExample(num: Int): Pair<Int, Int> {
    return Pair(num+1, num+2)
}


fun arraySum(arr: Array<Int>): Int {
    var sum: Int = 0
    for (item in arr) {
        sum += item
    }
    return sum
}

fun sumNum(vararg nums: Int): Int {
    var sum = 0
    nums.forEach {n -> sum += n}
    return sum
}

fun fact(n: Int): Int {
    tailrec fun factTail(y: Int, z: Int): Int {
        if(y == 0) return z
        else return factTail(y-1, z * y)
    }
    return factTail(n, 1)
}
