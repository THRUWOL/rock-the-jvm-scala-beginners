package engCourse.lectures.part1basics

import scala.util.Random

object Expressions extends App {

  val x = 1+2 // Выражение
  println(x)

  println(2+3*4) // Математическое выражение (выполняется справа налево)
  // + - / * & | >> << >>>

  println(1 == x) // Булевое вывражение
  // == != > >= < <=

  println(!(1 ==x))
  // ! && ||

  var aVariable = 2
  aVariable += 3 // работает с -= *= /=

   // IF выражение
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3
  println(aConditionedValue)

  // WHILE цикл
  var i = 0
  while (i < 10){
    println(i)
    i+=1
  }

  // В Scala всё является выражением

  val aWeirdValue = (aVariable = 3) // Unit === void
  println(aWeirdValue)

  // Code blocks
  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "hello" else "goodbye"
  }
  // Значения в блоке не видны снаружи

}
