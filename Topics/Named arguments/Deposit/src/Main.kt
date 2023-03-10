fun main() {
    val parametr = readln()
    val number = readln().toInt()
    when(parametr) {
        "amount" -> finalAmount(amount = number)
        "percent" -> finalAmount(percent = number)
        "years" -> finalAmount(years = number)
    }
}

fun finalAmount (amount: Int = 1000, percent: Int = 5, years: Int = 10) {
    val yearlyPercent = (1 + percent.toDouble() / 100.0)
    val pow = Math.pow(yearlyPercent, years.toDouble())
    println((amount * pow).toInt())
}