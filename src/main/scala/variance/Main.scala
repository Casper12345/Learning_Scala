package variance

object Main extends App {

  // in-variance
  class FirstClass[A]

  // co-variance
  class SecondClass[+A]

  // contra-variance
  class ThirdClass[-A]

  class MyClass extends FirstClass[Int]  // there is no connection between Int and MyClass

  class MyClass2 extends SecondClass[Int]  // Myclass2 is a sub class of Int

  class MyClass3 extends ThirdClass[Int]  // Myclass3 is a superclass class of Int

  // methods or functions in scala are covariant in the parameter and contravariant in the return type

  sealed trait Option[+A]
  case class Some[A](a: A) extends Option[A]
  case object None extends Option[Nothing] // there is no connection between nothing and A

  object Option {
    def map[A, B](o: Option[A], f: A => B): Option[B] = o match {
      case Some(a) => Some(f(a))
      case None => None
    }

  }

}
