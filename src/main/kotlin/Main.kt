fun timeConversion(s: String): String {
    return if (s[s.length - 2].lowercase() == "a") {
        if (s.substring(0, 2).toInt() < 12) {
            s.substring(0, s.length - 2)
        } else {
            "00" + s.substring(2, s.length - 2)
        }
    } else {
        if (s.substring(0, 2).toInt() < 12) {
            (s.substring(0, 2).toInt() + 12).toString() + s.substring(2, s.length - 2)
        } else {
            "12" + s.substring(2, s.length - 2)
        }
    }
}

fun main() {
    val s = "12:05:45AM"

    val result = timeConversion(s)

    println(result)
}