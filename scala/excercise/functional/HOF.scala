package excercise.functional

object HOF extends App{

  // function that applies a function n times over a value x
  // nTimes(f,n,x)
  // nTimes(f,3,x) = f(f(f(x))) = nTimes(f,2,f(x)) = f(f(f(x)))
  //nTimes(f,n,x) = f(f(...(f(x)))) = nTimes(f,n-1,f(x))


  def nTimes(f: Int => Int, n: Int, x: Int): Int =
      if (n <= 0) x
      else nTimes(f, n-1, f(x))
    val plusOne = (x: Int) => x + 1
    println(nTimes(plusOne, 10, 1))

  // ntb(f,n) = x => f(f(f...(x)))
  // increment10 = ntb(pluseOne,10) x => pluseOne(pluseOne...(x))
  // val y = increment10(1) = 11
  // increment10(2) = 12
  // increment10(3) = 13
  // increment10(4) = 14


  def nTimesBetter(f: Int =>  Int,n: Int):(Int => Int)=
    if (n <= 0) (x:Int) => x
    else (x: Int)  => nTimesBetter(f, n-1)(f(x))

  val plusten = nTimesBetter(plusOne,10)
  println(plusten(1))
  println(plusten(2))
  println(plusten(3))

  val nestedList = List(List(1, 2), List(3, 4), List(5))

  // Using flatMap to flatten the list and double each element
  val flatAndDoubled = nestedList.flatMap(x => x.map(_ * 2))
  println(flatAndDoubled)

  def applyTwice[A](f: A => A, x: A): A = {
    f(f(x))
  }

  val increment = (x: Int) => x + 1
  println(applyTwice(increment, 5)) 

}
