package practice

object Defaultparams extends App{

  //Default Parameters
//  def sum(a: Int = 5, b: Int = 5): Int = {
//    return a + b
//  }
//
//  println(sum(7))
//  println(sum(8, 6))
//  println(sum(0, 7))
//  println(sum())

//   def greeting(name: String="World", greet : String="Hello"): String =
//     s"$greet $name"
//
//   println(greeting())
//   println(greeting("John"))
//   println(greeting("John", "Howdy"))
//   println(greeting(greet= "Howdy"))
//   println(greeting( name= "Arpit"))
//   println(greeting(greet= "Holla", name= "Shivam"))

  def calculatePrice(basePrice: Double, taxRate: Double = 0.05, discount: Double = 0.1): Double = {
    val priceAfterTax = basePrice + (basePrice * taxRate)
    val finalPrice = priceAfterTax - (priceAfterTax * discount)
    finalPrice
  }

  // Example usages
  println(calculatePrice(100.0)) // Output: 94.5
  println(calculatePrice(100.0, 0.08)) // Output: 97.2
  println(calculatePrice(100.0, 0.08, 0.2)) // Output: 86.4
  println(calculatePrice(100.0, discount = 0.15)) // Output: 95.2
  println(calculatePrice(100.0, taxRate = 0.1)) // Output: 99.0
 
}
