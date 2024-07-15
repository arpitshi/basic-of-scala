package Assignment

import scala.annotation.tailrec

object socialnetwork extends App {
  def add(network: Map[String, Set[String]], person: String): Map[String, Set[String]] = {
    network + (person -> Set())
  }


  def friend(network: Map[String,Set[String]], a:String,b:String):Map[String,Set[String]] = {
    val friendsA = network(a)
    val friendsB = network(b)

    network + (a -> (friendsA + b)) + (b -> (friendsB + a))
  }
  def unfriend(network: Map[String,Set[String]], a:String,b:String):Map[String,Set[String]]= {
    val friendsA = network(a)
    val friendsB = network(b)

    network + (a -> (friendsA - b)) + (b -> (friendsB - a))
  }

  def remove(network: Map[String,Set[String]], person:String):Map[String,Set[String]]= {
    def removeaux(friends: Set[String], netwoekacc: Map[String, Set[String]]): Map[String, Set[String]] =
      if (friends.isEmpty) netwoekacc
      else removeaux(friends.tail, unfriend(netwoekacc, person, friends.head))

    val unfreinded = removeaux(network(person), network)
    unfreinded - person
  }
      val empty: Map[String,Set[String]] = Map()
      val network = add(add(empty,"bob"),"Marry")
      println(network)
      println(friend(network,"bob","Marry"))
      println(unfriend(friend(network,"bob","Marry"),"bob","Marry"))
      println(remove(friend(network,"bob","Marry"),"bob"))


      val people = add(add(add(empty,"bob"),"Marry"),"Jim")
      val jimbob =  friend(people,"bob","Jim")
      val testnet = friend(jimbob,"bob","Marry")

      println(testnet)

      def nfriend(network:Map[String,Set[String]], person:String):Int=
        if(!network.contains(person))0
        else network(person).size

      println(nfriend(testnet,"bob"))

  def mostfriends(network: Map[String, Set[String]]): String =
    network.maxBy(pair => pair._2.size)._1

  println(mostfriends(testnet))

  def nPeoplewithnoFriends(network: Map[String, Set[String]]):Int=
    network.count(pair => pair._2.isEmpty)

  println(nPeoplewithnoFriends(testnet))

  def socialConnection(network:Map[String, Set[String]], a:String, b:String):Boolean= {
    @tailrec
    def bfs(target: String, consideredPeople: Set[String], discoveredPeople: Set[String]): Boolean = {
      if (discoveredPeople.isEmpty) false
      else {
        val person = discoveredPeople.head
        if (person == target) true
        else if (discoveredPeople.contains(person)) bfs(target, consideredPeople, discoveredPeople)
        else bfs(target, consideredPeople + person, discoveredPeople.tail ++ network(person))
      }
    }
    bfs(b,Set(),network(a)+a)

  }
  println(socialConnection(testnet,"Marry","Jim"))
}
