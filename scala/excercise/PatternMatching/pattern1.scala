package excercise.PatternMatching

import scala.util.Random

object pattern1 extends App{
    val random = new Random
    val num = random.nextInt(10)

    val discription = num match{
       case 0 => "The number is Zero"
       case 1 => "The number is One"
       case 2 => "The number is Two"
       case 3 => "The number is Three"
       case 4 => "The number is Four"
       case _ => "Something else"
    }
    println(num)
    println(discription)

    case class Person(name: String, age: Int)
    val person = Person("John Doe", 22)

    val result = person match {
      case Person(name, age) if age<21 => s"My name is $name and $age years old and i cant drink in USA"
       case Person(name, age) => s"My name is $name and $age years old"
       case _ => "i dont know whom i am"
    }
    println(result)

  /*
     1. cases are matched in order
     2. what if no cases match? MatchError
     3. type of the PM expressoion? unified type of all the types in all the cases
     4. PM works really well with case classes*

    */

  // PM on sealed hierarchies
  sealed class Animal
  case class Dog(breed: String) extends Animal
  case class Parrot(greeting: String) extends Animal

  val animal: Animal = Dog("Terra Nova")
  animal match {
    case Dog(someBreed) => println(s"Matched a dog of the $someBreed breed")
  }

  // match everything
  val isEven = num match {
    case n if n % 2 == 0 => true
    case _ => false
  }
  // WHY?!
  val isEvenCond = if (num % 2 == 0) true else false // ?!
  val isEvenNormal = num % 2 == 0

  /*
    Exercise
    simple function uses PM
     takes an Expr => human readable form

     Sum(Number(2), Number(3)) => 2 + 3
     Sum(Number(2), Number(3), Number(4)) => 2 + 3 + 4
     Prod(Sum(Number(2), Number(1)), Number(3)) = (2 + 1) * 3
     Sum(Prod(Number(2), Number(1)), Number(3)) = 2 * 1 + 3
   */
  trait Expr
  case class Number(n: Int) extends Expr
  case class Sum(e1: Expr, e2: Expr) extends Expr
  case class Prod(e1: Expr, e2: Expr) extends Expr

  def show(e: Expr): String = e match {
    case Number(n) => s"$n"
    case Sum(e1, e2) => show(e1) + " + " + show(e2)
    case Prod(e1, e2) => {
      def maybeShowParentheses(exp: Expr) = exp match {
        case Prod(_, _) => show(exp)
        case Number(_) => show(exp)
        case _ => "(" + show(exp) + ")"
      }

      maybeShowParentheses(e1) + " * " + maybeShowParentheses(e2)
    }
  }

  println(show(Sum(Number(2), Number(3))))
  println(show(Sum(Sum(Number(2), Number(3)), Number(4))))
  println(show(Prod(Sum(Number(2), Number(1)), Number(3))))
  println(show(Prod(Sum(Number(2), Number(1)), Sum(Number(3), Number(4)))))
  println(show(Sum(Prod(Number(2), Number(1)), Number(3))))

}
