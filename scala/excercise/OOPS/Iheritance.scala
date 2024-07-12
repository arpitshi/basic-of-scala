package excercise.OOPS

object Iheritance extends App{
   val dog = new Dog("tommy")
   dog.eat()
   dog.bark()
}
class Animal(val name: String){
  def eat(): Unit = {
    println(s"$name is eating")
  }
}
class Dog(name: String) extends Animal(name) {
  def bark(): Unit = {
    println(s"$name is barking")
  }
}