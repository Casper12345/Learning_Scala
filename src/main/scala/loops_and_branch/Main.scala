package loops_and_branch

import scala.annotation.tailrec

object Main extends App {

  val whatever = false
  while (whatever) {
    println("hello")
  }

//  val a = Array(1,2,3,4,5)
//  for { i <- 0 to a.length} yield {
//    println(i)
//  }
//
}


object StructuralRecursion extends App {

  val a = Array(1,2,3,4,5)

  @tailrec
  def go(i: Int): Unit = {
    if(i < a.length) {println(a(i)); go(i - 1)} else ()
  }

  // structural recursion
  def lastOrZero(xs: List[Int]): Int = xs match {
    case _ :: t => lastOrZero(t)
    case h :: Nil => h
    case Nil => 0
  }

  def go2(f: Int => Int): Int =
    f(2)

//  a.foreach(i => println(i))


}

object Exercises extends App {

  def sum(xs: List[Int]): Int = {
    @tailrec
    def go(xs: List[Int], acc: Int): Int = xs match {
      case h :: t => go(t, h + acc)
      case Nil => acc
    }
    go(xs, 0)
  }

  def sum2(xs: List[Int]): Int = xs.reduce(_ + _)

  def reduce[A](xs: List[A], f: (A,A) => A): A = {
    @tailrec
    def go(xs: List[A], acc: A): A = xs match {
      case h :: Nil => f(h, acc)
      case h :: t => go(t, f(acc, h))
    }
    go(xs.tail, xs.head)
  }

//  println(reduce[Int](List(), (a, b) => a + b))

  def foldLeft[A,B](xs: List[A], z: B, f: (B,A) => B): B = xs match {
    case h :: t => foldLeft(t, f(z, h), f)
    case Nil => z
  }

  def foldRight[A,B](xs: List[A], z: B, f: (A,B) => B): B = xs match {
    case h :: t => f(h, foldRight(t, z, f))
    case Nil => z
  }

//  sum2(Nil)

}

object Branching extends App {

  // basic
  if(true) 0 else if (false) 1 else 2
  val mmm = if(true) {34} else 0

  val b = true

  // with pattern matching
  b match {
    // without guard
    case true  => 2
    // with guard
    case true if true => 3
    // the default statement
    case _ => 3
  }
  // matching on tuples
  (true, true, false) match {
    case (a,b,c) => println(s"$a, $b, $c")
  }

}
