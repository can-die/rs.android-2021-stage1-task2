package subtask3

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*
import kotlin.reflect.KClass

class Blocks {

    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {
        when (blockB) {
            String::class -> {
                var res = ""
                for (i in blockA.indices) {
                    if (blockA[i] is String)
                        res = res + blockA[i]
                }
                return res
            }
            Int::class -> {
                var res = 0
                for (i in blockA.indices) {
                    if (blockA[i] is Int)
                        res = res + (blockA[i] as Int)
                }
                return res
            }
            LocalDate::class -> {
                var res = LocalDate.MIN
                for (i in blockA.indices) {
                    if ((blockA[i] is LocalDate) && ((blockA[i] as LocalDate) > res))
                        res = (blockA[i] as LocalDate)

                }
                return res.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"))
            }
            else -> return ""
        }
    }
}
