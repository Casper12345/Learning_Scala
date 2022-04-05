package collections

object Exercises extends App{

  // 1.  given a list of records sort the records ascending and return the sum of the values
  case class Record(id: Char, value: Int)

  val input = List(
    Record('h', 2),
    Record('e', 1),
    Record('d', 2),
    Record('b', 10),
    Record('a', 9),
  )

  val ans1A = input.sortWith( _.id < _.id )
  val ans1B = ans1A.foldLeft(0)((a, r) => a + r.value)
  //println(ans1A)
  //println(ans1B)

  // 2. Given a list of records group them by id and multiply the grouped values by a factor 2
  val input2 = List(
    Record('a', 2),
    Record('a', 1),
    Record('a', 2),
    Record('b', 10),
    Record('b', 9),
    Record('b', 90),
    Record('c', 12),
    Record('d', 3),
    Record('d', 1),
  )

  val ans2 = input2.groupBy(_.id).map { case (c, xs) => c -> xs.map(r => Record(r.id, r.value * 2)) }
  //println(ans2)

  // 3. Given a list of records collect the charaters into a string and sum the values

  val input3 = List(
    Record('h', 2),
    Record('e', 1),
    Record('l', 2),
    Record('l', 10),
    Record('o', 9),
    Record(' ', 2),
    Record('w', 90),
    Record('o', 12),
    Record('r', 3),
    Record('l', 1),
    Record('d', 8),
  )

  //val ans3A = input3.foldLeft("")((a, r) => a + r.id)
  //val ans3B = input3.foldLeft(0)((a, r) => a + r.value)
  val ans3 = input3.foldLeft(("", 0))((a, r) => (a._1 + r.id, a._2 + r.value))
  //println(s"$ans3A, $ans3B")
  //println(ans3)

  // 4. Given a list of records return all records with values higher than 9

  val input4 = List(
    Record('a', 2),
    Record('a', 1),
    Record('a', 2),
    Record('a', 10),
    Record('b', 9),
    Record('a', 2),
    Record('b', 90),
    Record('c', 12),
    Record('c', 3),
    Record('c', 1)
  )

  val ans4 = input4.filter(r => r.value > 9)
  //println(ans4)

  // 5. Given the same list of records return all records with values higher than 8 and where charater is a
   val ans5 = input4.filter((r => r.value > 8 && r.id == 'a'))
  //println(ans5)

  // 6. Given two list of records return one list contain a tuple with a string and the sum of values eg output: List(("hello world", sum))

  val input5 = List(
    Record('h', 2),
    Record('e', 1),
    Record('l', 2),
    Record('l', 10),
    Record('o', 9),
  )

  val input6 = List(
    Record('w', 90),
    Record('o', 12),
    Record('r', 3),
    Record('l', 1),
    Record('d', 8),
  )

  val ans6 = (input5 ++ input6).foldLeft(List(("", 0)))((a, r) => List((a.head._1 + r.id, a.head._2 + r.value)))
  //println(ans6)

}
