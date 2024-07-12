package excercise.OOPS

object Objects extends App{
  val car1 = Car("Toyota", "Camry", 2020)
  val car2 = Car("Honda", "Civic", 2021)

  println(car1.details)
  println(car2.details)
  println(Car.compare(car1, car2))
}
class Car(val make: String, val model: String, val year: Int) {
  def details: String = s"$year $make $model"
}

object Car {
  def apply(make: String, model: String, year: Int): Car =
    new Car(make, model, year)

  def compare(car1: Car, car2: Car): String = {
    if (car1.year > car2.year) s"${car1.details} is newer than ${car2.details}"
    else if (car1.year < car2.year) s"${car1.details} is older than ${car2.details}"
    else s"${car1.details} and ${car2.details} are from the same year"
  }
}
