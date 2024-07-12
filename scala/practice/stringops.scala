package practice

object stringops extends App{

//  val name = "stringops"
//  val name2 = "arpitshivam"
//
//  println(name + " " + name2)
//  println(name.concat(" ").concat(name2))
//
//  println(name.length)
//  println(name2.charAt(5))
//  println(name.replace("s", "l"))
//
//  println(name.substring(0,1))


  val name = "Alice"
  val age = 25

  val greeting = s"Hello, my name is $name and I am $age years old."
  println(greeting)
  val x = 5
  val y = 10

  val result = s"The sum of $x and $y is ${x + y}."
  println(result)

  val name1 = "Alice"
  val height = 1.7

  val description = f"$name1%s is $height%2.2f meters tall."
  println(description)

  val name3 = "Carol"
  val weight = 68.5

  val statement = f"$name3%s weighs $weight%2.0f kg."
  println(statement)

  val path = raw"C:\Users\Alice"
  println(path)


}
