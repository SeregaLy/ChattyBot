fun main() {
    var sum = 0
    val a = readln().toInt()
    val b = readln().toInt()
    for (i in a..b) {
        sum += i
    }
    print(sum)
}
