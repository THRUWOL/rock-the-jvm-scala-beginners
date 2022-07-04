package HorstmanTasks.First

import scala.BigInt.probablePrime
import scala.math._
import scala.util.Random

object FirstTasks2 extends App{
  // Задание 2
  var number1, number2: Int = 3

  println(number1)
  println(pow(sqrt(number1),2))

  // Задание 4

  println("crazy" * 3)

  // Задание 6

  println(BigInt(2) pow 1024)

  // Задание 8

  val randomNumber: BigInt = probablePrime(100, Random)
  val convertString: String = randomNumber.toString(36)

  println(convertString)

}
