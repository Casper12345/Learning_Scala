package collections

object Exercises {

  // 1.  given a list of records sort the records ascending and return the sum of the values
  case class Record(id: Char, value: Int)

  val input = List(
    Record('h', 2),
    Record('e', 1),
    Record('d', 2),
    Record('b', 10),
    Record('a', 9),
  )

  val ans1 = input.sortWith()


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

  // 5. Given the same list of records return all records with values higher than 8 and where charater is a

}
