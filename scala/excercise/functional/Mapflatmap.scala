package excercise.functional

object Mapflatmap extends App{
    val list = List(1,2,3,4,5,6,7,8,9,10)
    println(list.head)
    println(list.tail)

    // map
    println(list.map(_ + 1))
    println(list.map(_ * 2))
    println(list.map(_ + "is a number"))

    // flitter
    println(list.filter(_ % 2==0))

    //flatmap

    val number = List(1,2,3,4)
    val character = List('a', 'b', 'c', 'd')
    val color = List( "black" , "white")


    //Iterating
      val combination = color.flatMap(n => character.flatMap(ch => number.map(c => "" + n + ch + c)))
              println(combination)


    val new_list=number.flatMap(n=>List(n-1,n,n+1))
      println(new_list)
      println(color.flatMap(_.toUpperCase))

    //foreach
    number.foreach(n=>println(n))
    number.foreach(println)

    //// for-comprehension
    // acha tarika
    val forCombination = for{
      n <- number if n % 2 ==0
      ch <- character
      c <- color
    }yield  "" + n + ch + c
    println(forCombination)

    for{
      n <- number if n % 2 ==0
    }println(n )
}
