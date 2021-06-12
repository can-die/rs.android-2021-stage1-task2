package subtask2

class Abbreviation {

    fun abbreviationFromA(a: String, b: String): String {
        if (b == "")
            return "YES"

        var i = 0
        var res = ""
        for (ch in a) {
            val chUp = ch.toUpperCase()
            if (chUp == b[i]) {
               res = res + chUp
               i = i + 1

               if (i > b.length - 1)
                   return "YES"
            }
        }
        return if (res == b) "YES" else "NO"
    }
}
