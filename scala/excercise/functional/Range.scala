package excercise.functional

object Range extends App {
      val arange: Seq[Int] = 1 to 12
      arange.foreach(println)

      val arange2: Seq[Int] = 1 until 12
      arange2.foreach(println)

      (1 to 12).foreach(x => println("Hello Arpit"))
      arange.reverse.foreach(println)
      println(arange.sum)
      println(arange.max)
      println(arange.min)
      println(arange.filter(_ % 2 == 0))
      println(arange.grouped(3).toList)
      println(arange.distinct)
      println(arange.sorted)
      println(arange.sorted.grouped(3).toList)
      println(arange.sliding(3).toList)




}
