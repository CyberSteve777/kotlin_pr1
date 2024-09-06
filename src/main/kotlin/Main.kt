package org.example


class Spending {
    private val sum: Long
    private val category: String
    private val date: String

    constructor (sum: Long, category: String, date: String) {
        this.sum = sum
        this.category = category
        this.date = date
    }

    fun getSum(): Long {
        return sum
    }

    fun getCategory(): String {
        return category
    }


    fun printInfo() {
        println("Spending[$category; $date; $sum]")
    }
}

class SpendingArray {
    private var data: ArrayList<Spending> = ArrayList()

    constructor()

    fun printInfo() {
        for (item in data) item.printInfo()
    }

    fun add(item: Spending) {
        data.add(item)
    }

    fun calcSum(): Long {
        var sum = 0L;
        for (item in data) {
            sum += item.getSum()
        }
        return sum
    }

    fun printInfoByCategory(category: String) {
        for (item in data) {
            if (item.getCategory() == category) {
                item.printInfo()
            }
        }
    }
}

fun main() {
    val spendingList = SpendingArray()
    spendingList.add(Spending(1000, "food", "12.12.2012"))
    spendingList.add(Spending(100, "clothes", "13.12.2012"))
    spendingList.add(Spending(2000, "games", "14.12.2012"))
    spendingList.add(Spending(3000, "food", "15.12.2012"))
    println("Spendings:")
    spendingList.printInfo()
    println("Total sum: ${spendingList.calcSum()}")
    println("Spendings on food:")
    spendingList.printInfoByCategory("food")
}