fun main() {
    val (first, second) = readln().split(' ')
    var firstCountry: String = first
    var secondCountry: String = second
    for (enum in CountryCurrencies.values()){
        if (first == enum.toString()) {
            firstCountry = enum.currencies
        } else if (second == enum.toString()) {
            secondCountry = enum.currencies
        }
    }
    if (firstCountry == secondCountry) {
        println("true")
    } else {
        println("false")
    }

}

enum class CountryCurrencies (val currencies: String) {
    Germany	("Euro"),
    Mali ("CFA franc"),
    Dominica ("Eastern Caribbean dollar"),
    Canada ("Canadian dollar"),
    Spain ("Euro"),
    Australia ("Australian dollar"),
    Brazil ("Brazilian real"),
    Senegal ("CFA franc"),
    France ("Euro"),
    Grenada	("Eastern Caribbean dollar"),
    Kiribati ("Australian dollar")
}