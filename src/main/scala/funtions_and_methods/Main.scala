package funtions_and_methods

object Main extends App {

  // I am a static method
  def method1(s: String): Unit = println("hello")


  // lambda function
  val myFunction: Int => Boolean = i => i > 0

  def curry(s: String)(i: Int)(s1: String): Unit = {
    println(s)
    println(i)
    println(s1)
  }

  val myCurried: (Int, String) => Unit = curry("hello")(_)(_)

  val myCurried2 = myCurried(2, _)

  myCurried2("there")

  def higherOrder(f: String => String): String => String = f




}

class MyClass {

  // I am a class method
  def method1(s: String): Unit = println("hello")



}
object Partial extends App {

  val mmm = List(1,2,3,4).map {
    case x if x < 2 => x
    case x => 0 // will not run without a default statement
  }
  println(mmm)

  val hhhh = new PartialFunction[Int, Int] {
    override def isDefinedAt(x: Int): Boolean = x == 2

    override def apply(v1: Int): Int = 100
  }

  val hhhh2 = new PartialFunction[Int, Int] {
    override def isDefinedAt(x: Int): Boolean = x < 2

    override def apply(v1: Int): Int = v1
  }


  val hhh = List(1,2,3,5).collect {
    hhhh.orElse(hhhh2)
  }

  println(hhh)

}
