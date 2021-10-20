fun main(args: Array<String>) {
    println("Введите сумму покупки")
    var purchaseAmmount = readLine()!!.toInt()
    var discountAmmount : Int
    val commisionPercentage = 5
    val additionalCommisionPercentage = 1
    val meloman = true

    println("покупка - $purchaseAmmount копеек")
    when(purchaseAmmount) {
        in 0..100000 -> {
            discountAmmount = 0
            if(meloman) println("после применения скидки $additionalCommisionPercentage% ${purchaseAmmount-purchaseAmmount/100*additionalCommisionPercentage} копеек")
        }
        in 100100..1000000 -> {
            discountAmmount = 10000
            purchaseAmmount = purchaseAmmount - discountAmmount
            println("после применения скидки 100 рублей - $purchaseAmmount копеек")
            if(meloman) println("после применения скидки $additionalCommisionPercentage% - ${purchaseAmmount - purchaseAmmount/100*additionalCommisionPercentage} копеек")
        }
        in 1000100..9223372036854775807 -> {
            discountAmmount = purchaseAmmount/100 * commisionPercentage
            purchaseAmmount = purchaseAmmount - discountAmmount
            println("после применения скидки $commisionPercentage% - $purchaseAmmount копеек")
            if(meloman) println("после применения скидки $additionalCommisionPercentage% - ${purchaseAmmount - purchaseAmmount/100*additionalCommisionPercentage} копеек")
        }
    }
}