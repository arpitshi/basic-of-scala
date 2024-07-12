package practice

object funct extends App {

  //  def naamage(s: String,n: Int):String =
  //    "hey my name is " + s + " and my age is " + n + " years old"
  //  println(naamage("arpit" ,21))
  //
  //  def fact(n : Int):Int=
  //    if(n == 0) 1
  //    else n * fact(n-1)
  //  println(fact(5))

  def fact(n: Int): Int = {
    @scala.annotation.tailrec
    def internalfac(accu: Int, n: Int): Int = {
      if (n == 0) accu
      else internalfac(accu * n, n - 1)
    }

    internalfac(1, n)
  }

  println(fact(5))
  //
  //  def fib(n : Int):Int=
  //    if(n == 0 || n == 1) 1
  //    else fib(n-1) + fib(n-2)
  //  println(fib(10))

  def fib(n: Int): Int = {
    @scala.annotation.tailrec
    def internalfib(i: Int, prev: Int, curr: Int): Int = {
      if (i >= n) curr
      else internalfib(i + 1, curr, curr + prev)
    }

    if (n <= 1) n
    else internalfib(1, 0, 1)
  }

  println(fib(10))
  //  def isPrime(n : Int):Boolean={
  //    def isprimeuntil(t : Int):Boolean=
  //    if(t<=1)true
  //    else n%t!=0 && isprimeuntil(t-1)
  //
  //    isprimeuntil(n/2)
  //
  //
  //  }
  //
  //  println(isPrime(3))

//  def sumofArray(arr: Array[Int]): Int = {
//    @scala.annotation.tailrec
//    def internalsum(accu: Int, arr: Array[Int]): Int = {
//      if (arr.isEmpty) accu
//      else internalsum(accu + arr(0), arr.tail)
//    }
//
//    internalsum(0, arr)
//  }
//println(sumofArray(Array(1, 2, 3,7,8,9,12)))



}