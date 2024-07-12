package excercise.functional

object Anonymous extends App{
  //Normal methods
  val add = (a:Int, b:Int) =>a+b
  val sub = (a:Int, b:Int) =>a-b
  val mul = (a:Int, b:Int) =>a*b

  // anonther Methods(Multipal Paras

   val Add: (Int, Int)=>Int = (x:Int,y:Int) => x+y
   val Sub: (Int, Int)=>Int = (x:Int,y:Int) =>x-y
   val Mul: (Int, Int)=>Int = (x:Int,y:Int) =>x*y

   // No parameters

   val jusdosomethin: () => Int = () => 4
   println(jusdosomethin) // Functions Itself
   println(jusdosomethin()) //calls

  // MOAR syntactic sugar
   val Add1: (Int, Int)=>Int = _ + _
   val Sub1: (Int, Int)=>Int = _ - _
   val Mul1: (Int, Int)=>Int = _ * _

  val complexFunction = (x: Int, y: Int) => {
    val sum = x + y
    val product = x * y
    (sum, product)
  }
  println(complexFunction(3, 4)) // Output: (7, 12)

  val isEven = (x: Int) => x % 2 == 0
  println(isEven(4))
  println(isEven(5))


  val numbers = List(1, 2, 3, 4, 5)
  val doubled = numbers.map(x => x * 2)
  println(doubled)
  val evenNumbers = numbers.filter(_ % 2 == 0)
  println(evenNumbers)

  val sum = numbers.reduce((a, b) => a + b)
  println(sum)


}
