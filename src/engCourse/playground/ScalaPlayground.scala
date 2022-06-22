package engCourse.playground

import scala.collection._


import java.math.BigInteger

object ScalaPlayground extends App{
  val big = new BigInteger("12345")
  println(big)

  val greetString: Array[String] = new Array[String](3)
  greetString(0) = "Hello"
  greetString(1) = ", "
  greetString(2) = "world!\n"


  for(i <- 0 to 2)
    print(greetString(i))

  val numNames = Array("zero", "dot", "one")
  numNames(0) = "test"
  print(numNames(0))

  val oneTwoThree = List(1, "two", 0.3f)
  println(oneTwoThree.getClass)
  for (i <- oneTwoThree) println(i.getClass)

  val pair = (99, 56, 25, 99, 56, 25, 99, 56, 25, 99, 56, 25, 99, 56, 25, 55, 54, 23, 4, 123, 2323, 33)
  println(pair)

  var jetSet = mutable.Set("A", "B")
  jetSet.apply("C")

  val treasureMap = mutable.Map[Int, String]()
  treasureMap += (1 -> "Go to island")
  treasureMap += (2 -> "2223")
  treasureMap += (3 -> "3")
  println(treasureMap(2))

}
