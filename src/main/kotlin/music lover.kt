fun main() {
    val purchaseAmount = 115000
    val standardDiscount = 10000
    val discount = 0.05
    val melomanDiscount = 0.01
    val meloman = 0 //если меломан, то 1
    val payment : Int  = if (purchaseAmount <=100000) purchaseAmount else if (purchaseAmount < 1000000) purchaseAmount - standardDiscount else (purchaseAmount * (1 - discount)).toInt()

    val paymentMeloman = if (meloman == 1) payment * (1 - melomanDiscount) else payment
    println("Стоимость покупки: $purchaseAmount копеек" )
    println("Стоимость со скидкой: $payment копеек")
    println("Стоимость со скидкой меломану: $paymentMeloman копеек")

}



