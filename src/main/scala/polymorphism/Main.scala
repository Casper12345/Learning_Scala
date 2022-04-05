package polymorphism

object Main extends App {
  // 2. Method overloading

  def hello(s: String): String = ""
  def hello(s: String, i: Int): String = ""

  // 3. Parametric aka generics
  def hello2[A](a: A): String = ""

}

// 1. inheritance
class A { def hello: Unit = println("hello") }
class B extends A {override def hello: Unit = println("good bye")}




