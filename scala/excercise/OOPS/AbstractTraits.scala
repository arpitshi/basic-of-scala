package excercise.OOPS

object AbstractTraits extends App{
  val s = new square(5)
  val c = new circle(7)
  println("Square area is "+ s.area)
  println("circle area is "+c.area)
  println("Square perimeter is "+s.perimeter)
  println("circle perimeter is "+c.perimeter)
  println("Square color is "+s.color)
  println("circle color is "+c.color)
  c.move(2,3)
  s.move(4,7)
}
  abstract class shape{
    def area: Double
    def perimeter: Double
  }
  trait color{
    def color: String
  }
  trait moveable{
    def move(x: Double, y: Double): Unit
  }
  class circle(val r:Double) extends shape with color with moveable{
    def area: Double = 3.14*r*r
    def perimeter: Double = 3.14*r
    override def color = "red"
     def move(x: Double, y: Double): Unit = {
      println(s"circle move by ($x,$y)")
    }
  }
class square(val l:Double) extends shape with color with moveable{
  def area: Double = l*l
  def perimeter: Double = 4*l
   def color = "blue"
  override def move(x: Double, y: Double): Unit = {
    println(s"square move by ($x,$y)")
  }
}