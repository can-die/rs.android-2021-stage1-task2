package subtask1

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.format.ResolverStyle
import java.util.*

class DateFormatter {

    fun toTextDay(day: String, month: String, year: String): String {
        try {
            val date = LocalDate.parse("$year-$month-$day",
                DateTimeFormatter.ofPattern("uuuu-M-dd").withResolverStyle(ResolverStyle.STRICT))
            return date.format(DateTimeFormatter.ofPattern("dd MMMM, EEEE", Locale.forLanguageTag("RU")))
        } catch (e: Exception) {
            return "Такого дня не существует"
        }
    }
}
