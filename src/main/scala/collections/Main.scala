package collections

import scala.collection.mutable.ListBuffer

object Main extends App {

  // immutable data structures
  // use val rather than var
  var myVar = 23
  myVar = 34

  val myVal = 23
  val myVal2 = 34

  // singly linked list that is immutable
  val list = List(1,2,3,4,5)
  val list2 = 1 :: list

  println(list)
  println(list2)

  // listbuffer is mutable
  val listBuffer = ListBuffer(1,2,3,4)
  listBuffer += 1

  // immutable Map

  val map = Map[Int, Int](1 -> 1)
  val map2 = map + (2 -> 2)
  println(map)
  println(map2)


  val a1 =List(1,2,3,5,6).map(a => a + 1)

  val a2 =List(1,2,3,5,6).reduce(_ + _)

  val aac = List(1,2,3,5,6).fold[Int](0)((a: Int, b: Int) => a + b)

  val a3 = List(1,2,3,5,6).headOption

  val a4 = List(Option(1), Option(2)).flatten

  val a5 = List(Option(1), Option(2)).flatten

  val a6 = List(1,2).filter(a => a > 1)

  val a7 = List(1,2).sortWith(_ < _)

  val (l,r) = List(1,2,2,2,2,2,2).partition(_ == 2)

  val r1 = List(1,2,2,2,2,2,2).drop(3)

  val r2 = List(1,2,2,2,2,2,2).take(3)

  val r3 = List(1,2,3,4).groupBy(_ == 1)

}
