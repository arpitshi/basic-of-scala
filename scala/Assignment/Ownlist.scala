package Assignment


//  val empty = new Cons(1,)
//
//  val list = empty.add(1)
//
////  println(list)
//
//  println(list.head)
//  println(list.tail)
////  println(list.tail.head)
////  println(list.tail.tail)
////
////  println(list.tail.tail.head)
//}
//abstract class Mylist{
//  def head: Int
//  def tail: Mylist
//  def isEmpty: Boolean
//  def add(x: Int): Mylist
////  def remove(x: Int): Mylist
//  def printElements: String

//  override def toString: String = "[" + printElements + "]"
//}
//
//class Empty extends Mylist{
//  def head:Int= throw new NoSuchElementException()
//  def tail:Mylist= throw new NoSuchElementException
//  def isEmpty: Boolean = true
//  def add(x: Int): Mylist = new Cons(x,this)
////  def remove(x: Int): Mylist=MyList[Empty]
//  def printElements: String = " "
//}
//
//class Cons( h: Int, t: Mylist) extends Mylist{
//  def head: Int = h
//  def tail: Mylist = t
//  def isEmpty: Boolean = false
//  def add(x: Int): Mylist = new Cons(x,this)
//  def remove(x: Int): Mylist ={

//    def helper(h:Int,t:MyList,ind:Int):Int={
//      if(h==x) ind
//      else helper(t.head,t.tail)
//    }


//
//  def printElements: String = {
//    if (tail.isEmpty) s"$head"
//    else s"$head, ${tail.printElements}"
//  }

  