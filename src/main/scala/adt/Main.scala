package adt

// Sum type pattern // A is a B or a C
// used to model enums etc.
sealed trait Color
case object Red extends Color
case object Blue extends Color

// product type pattern // A has a B and a C
case class Colour[A,B](a: A, b: B)
object  Main {
  Colour(Red, Blue)
}





