package classes_and_more

object Main extends App {

  def thisIsAStaticMethod(): Unit = ???

  val c = new MyClass

  val m1 = MyCaseClass(1, "s")
  val m2 = MyCaseClass(2, "s2")

  m2 match {
  // case classes lets us pattern match
    case MyCaseClass(i,s) => println(s"$i, $s")
  }

}

class MyClass extends MyTrait with Mixing {

  def thisIsAClassMethod(): Unit = ???

//  override def iAmAMethodContract(): Unit = ???

  override def notImplemented(): Unit = ???

  override def iAmAMethodContract(): Unit = ???
}

trait MyTrait {

  // is equivalent to interfaces but also its more
  def iAmAMethodContract(): Unit

  def iAmAnImplementation(): Unit = println("hello")

  def notImplemented(): Unit

}

trait Mixing {
  def notImplemented(): Unit
  // will not compile due to the diamond problem
//  def iAmAnImplementation(): Unit = println("hello")

}

abstract class MyAbstractClass {
  // these make it compatible with java
}


case class MyCaseClass(i: Int, s: String) {
  def myMethod(): Unit = println("hello")
}

// we we generally use case classes to store data
case class MyDataClass(i: Int, s: String)
