package error_handling

import scala.concurrent.{Future, Promise}
import scala.util.{Failure, Success, Try}


object Main extends App {

  implicit val ex = scala.concurrent.ExecutionContext.global


//  Try(List().head) match {
//    case Success(value) => println(value)
//    case Failure(e) => println(e)
//  }

  def safeHead(xs: List[Int]): Either[Throwable, Int] = Try(xs.head).toEither

//  println(safeHead(List()))


  Future

  val promise: Promise[Int] = Promise.successful {
    12
  }

  val promise2: Promise[Int] = Promise.successful(13)

  val future1: Future[Int] = promise.future // get a thread assigned
  val future2: Future[Int] = promise.future // get another thread assigned

  future1.onComplete {
    case Success(v) => println(v)
    case Failure(e) => println(e)
  }
  println("hello")




}
