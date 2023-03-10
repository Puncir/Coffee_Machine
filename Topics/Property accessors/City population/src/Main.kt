class City(val name: String) {
    var population: Int = 1
    set(values) {
        if (values < 0) {
            field = 0
        } else if (values > 50_000_000){
            field = 50_000_000
        } else
            field = values
    }
}