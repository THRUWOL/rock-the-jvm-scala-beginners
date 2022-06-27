package lectures.part1basics

import scala.io.StdIn.{readInt, readLine}

object StringOps extends App {

  val str: String = "Hello, I am learning Scala"

  println(str.charAt(2))
  println(str.substring(7, 11))
  println(str.split(" ").toList)
  println(str.startsWith("Hello"))
  println(str.replace(" ", "-"))
  println(str.toLowerCase())
  println(str.toUpperCase())
  println(str.length)

  val aNumberString = "45"
  val aNumber = aNumberString
  println('a' +: aNumberString :+ 'z')
  println(str.reverse)
  println(str.take(2))

  //Scala-specific: String interpolator

  //S-interpolator
  val name = "gg"
  val age = 22
  val greeting = s"Hello, my name is $name and I am $age old"
  println(greeting)

  //F-interpolator
  val speed = 1.2f
  val myth = f"$name%s can eat $speed%2.2f burgers per minute"
  println(myth)

  //RAW-interpolator
  println(raw"This is a \n newline")
  val escaped = "This in a \n newline"
  println(raw"$escaped")



}
