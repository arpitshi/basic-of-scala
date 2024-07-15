package excercise.functional

object TupleAndMap extends App{

  // Tuples = Finite Ordered List
  val aTuples = new Tuple2(2,"Arpit")
  val bTuples = Tuple2(3,"Pradeep")
  val cTuples = (4,"Shivam")

  println(aTuples._1)
  println(aTuples._2)

  println(aTuples.copy(_2 = "Hello Asp"))
  println(aTuples.swap)


  println(aTuples)
  println(bTuples)
  println(cTuples)

  // Maps - Keys -> values

  val aMap:  Map[String ,Int] = Map()

  val Phonebook = Map(("Jim",2345), "Jay"->5678).withDefaultValue(-1)
  println(Phonebook)
  println(Phonebook.contains("Jay"))
  println(Phonebook("Jay"))
  println(Phonebook("Kim"))
   val newPair = "Arpit"->1234
   val newPhonebook = Phonebook + newPair
   println(newPhonebook)

   println(newPhonebook.map(pair => pair._1.toLowerCase->pair._2))

   println(newPhonebook.filter(_._2 > 0))
   println(newPhonebook.filterKeys(x => x.startsWith("J")))

   println(newPhonebook.mapValues( number => "4595" + number))

   println(newPhonebook.toList)
   println(List(("Arpit",1234)).toMap)

   val names = List("Bob","James","Roy","Angela","Rohan","Jonsan")
   println(names.groupBy(name => name.charAt(0)))





}