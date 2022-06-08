fun main() {
    val n = readln().toInt()
    var temp = Int.MIN_VALUE
    var a = "YES"
    for (i in 1..n) {
        val s = readln().toInt()
        if (temp > s) {
            a = "NO"
            break
        } else temp = s
    }
    print(a)
}
