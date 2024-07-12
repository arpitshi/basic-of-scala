package excercise.OOPS

object Caseclas extends App{

  case class Person(name: String, age: Int)

    //Case classes in Scala are a concise way to define
    // immutable data structures with built-in functionality like pattern matching,
    // equality, and easy construction
    // case class are parameter are feilds
  val person = Person("John", 25)
  println(person.name)
  println(person.age)

  val person1 = Person("John",25)

  val person2 = person.copy(name = "John", age =45)

  println(person2.name)
  println(person2.age)
  println(person2.toString)
  println(person2.hashCode)
  println(person.equals(person1))
  println(person==person1)

}
