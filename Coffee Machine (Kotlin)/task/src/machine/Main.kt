package machine



fun main() {
    var waterHave = 400
    var milkHave = 540
    var beansHave = 120
    var cupsHave = 9
    var moneyHave = 550

    do {
        println("Write action (buy, fill, take, remaining, exit):")
        val action = readln()
        when (action) {
            "buy" -> {
                println("\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:")
                val coffeeType = readln().toIntOrNull()
                when (coffeeType) {
                    1 -> {
                        if (waterHave >= 250 && beansHave >= 16 && cupsHave >= 1) {
                            println("I have enough resources, making you a coffee!")
                            waterHave -= 250
                            beansHave -= 16
                            cupsHave-= 1
                            moneyHave += 4
                        } else {
                            println("Sorry, not enough water!")
                        }
                    }
                    2 -> {
                        if (waterHave >= 350 && milkHave >= 75 && beansHave >= 20 && cupsHave >= 1) {
                            println("I have enough resources, making you a coffee!")
                            waterHave -= 350
                            milkHave -= 75
                            beansHave -= 20
                            cupsHave-= 1
                            moneyHave += 7
                        } else {
                            println("Sorry, not enough water!")
                        }
                    }
                    3 -> {
                        if (waterHave >= 200 && milkHave >= 100 && beansHave >= 12 && cupsHave >= 1) {
                            println("I have enough resources, making you a coffee!")
                            waterHave -= 200
                            milkHave -= 100
                            beansHave -= 12
                            cupsHave-= 1
                            moneyHave += 6
                        } else {
                            println("Sorry, not enough water!")
                        }
                    }

                    else -> {
                    }
                }
            }
            "fill" -> {
                println("Write how many ml of water you want to add:")
                val waterFill = readln().toInt()
                waterHave += waterFill
                println("Write how many ml of milk you want to add:")
                val milkFill = readln().toInt()
                milkHave += milkFill
                println("Write how many grams of coffee beans you want to add:")
                val beansFill = readln().toInt()
                beansHave += beansFill
                println("Write how many disposable cups you want to add:")
                val cupsFill = readln().toInt()
                cupsHave += cupsFill
            }
            "take" -> {
                println("I gave you $$moneyHave")
                moneyHave = 0
            }
            "remaining" -> {
                remaining(waterHave, milkHave, beansHave, cupsHave, moneyHave)
            }
            "exit" -> break
        }
    } while(true)
}

fun remaining (water: Int, milk: Int, beans: Int, cups: Int, money: Int) {
    println("""
        The coffee machine has:
        $water ml of water
        $milk ml of milk
        $beans g of coffee beans
        $cups disposable cups
        $$money of money
    """.trimIndent())
}
