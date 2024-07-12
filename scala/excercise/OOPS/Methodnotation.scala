package excercise.OOPS

object Methodnotation extends App{

  val cars = new Cars("Toyota", "Corolla")
  println(cars.start("V6"))
  println(cars.stop())
  // Infix notation
  println((cars start "V6").replace("a","z"))

  // Postfix notation
  println(cars.honk)
}
class Cars(val make: String, val model: String) {
  def start(engineType: String): String = s"Starting $make $model with $engineType engine."

  def stop(): String = s"Stopping $make $model."

  def honk: String = s"$make $model is honking."
}
