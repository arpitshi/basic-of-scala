package excercise.functional

object Listfunc extends App{

  val al =   List(4,2,5,6,7,1)
  val preprendnor = 24 :: al
  val prepend = 34 +: al
  val append = al :+ 45
  val reverse = al.reverse
  val inserted = 12 +: al :+ 46
  val removed = al.filter(_!= 4)
  val sorted = al.sorted
  val sum = al.sum
  val product = al.product
  val average = sum / al.length

  println("Sum: " + sum)
  println("Product: " + product)
  println("Average: " + average)
  println("Length of List: " + al.length)
  println("Max Value: " + al.max)
  println("Min Value: " + al.min)
  println("Distinct List: " + al.distinct)

  println("Sorted List: " + sorted)




  println("Original List: " + al)
  println("Prepended-normally List: " + preprendnor)
  println("Prepended List: " + prepend)
  println("Appended List: " + append)
  println("Reversed List: " + reverse)
  println("Inserted List: " + inserted)
  println("Removed List: " + removed)
  println("Sorted List: " + sorted)
  println(al.mkString("-|-"))

}
