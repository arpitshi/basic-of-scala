package excercise.OOPS
class OverFlowException extends RuntimeException
class UnderFlowException extends RuntimeException
class MathCalculationException extends RuntimeException("Division by zero")

object Exceptionhadle extends App{
    def add(a:Int, b:Int)={
      val result =a+b
      if(a>0 && b>0 && result<0 ) throw new OverFlowException
      else if(a<0 && b<0 && result>0 ) throw new UnderFlowException
      else  result
    }
    def sub(a:Int, b:Int)={
      val result =a-b
      if(a>0 && b<0 && result<0 ) throw new OverFlowException
      else if(a<0 && b>0 && result>0 ) throw new UnderFlowException
      else  result
    }
    def multi(a:Int, b:Int)={
      val result =a*b
      if(a>0 && b>0 && result<0 ) throw new OverFlowException
      else if(a<0 && b<0 && result<0 ) throw new OverFlowException
      else if(a>0 && b<0 && result>0) throw new UnderFlowException
      else if(a<0 && b>0 && result>0) throw new UnderFlowException
      else  result
    }

    def divi( a:Int,b:Int) = {
      val result =a/b
      if(a>0 && b<0) throw new MathCalculationException
      else result
    }

    println(Exceptionhadle.add(3,5))
    println(Exceptionhadle.sub(3,5))
    println(Exceptionhadle.multi(3,556666666))
    println(Exceptionhadle.divi(3,0))

}
