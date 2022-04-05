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
