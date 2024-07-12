package excercise.OOPS

object Poly extends App{
    val animals: List[Animals] =List(new Dogs,new Cat  )
    animals.foreach(_.sounds())
//    animals._.meow()
//    animals.foreach(_.meow())
    animals.foreach {
      case cat: Cat => cat.meow() // Only calls meow() on instances of Cat
      case dog: Dogs => dog.bark()
      case _=> println("cannot find the desiered animal")
      // For other instances, do nothing
    }


}
class Animals{
  def sounds():Unit={
    println("Animals make sounds")
  }
}
class Dogs extends Animals{
  override def sounds():Unit={
    println("Dogs make sounds")
  }
  def bark():Unit={
    println("Dogs bark")
  }
}
class Cat extends Animals{
  override def sounds():Unit={
    println("Cat makes sounds")
  }

  def meow():Unit={
    println("Cat meows")
  }
}