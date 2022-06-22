package lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App{
  def factorial(n:Int): Int =
    if (n<=1) 1
    else{
      println("Computing factorial of " + n + " - first need factorial of " + (n-1))
      val result = n * factorial(n-1)
      println("Computed factorial of " + n)
      result
    }

  println(factorial(10))

  def anotherFactorial(n:Int): BigInt = {
    @tailrec
    def factorialHelper(x:Int, accumulator:BigInt): BigInt =
      if(x <= 1) accumulator
      else factorialHelper(x-1, x * accumulator)

    factorialHelper(n, 1)
  }

  println(anotherFactorial(5))

  def repeatWord(word:String, n:Int):String = {
    def loop(i: Int, accumulator:String = word):String = {
      if(i <= 1) accumulator
      else loop(i-1, s"$word $accumulator")
    }

    loop(n)
  }

  println(repeatWord("test", 10))

  def powerOfTwo(number: Int): BigInt = {
    def loop(iterator: Int, accumulator: BigInt = 1): BigInt = {
      if(iterator == 0) accumulator
      else loop(iterator - 1, 2 * accumulator)
    }
    loop(number)
  }

  println(powerOfTwo(64))

  def counterOfNumber(x:Int, y:Int, n:Int):Int = {
    def loop(i: Int, accumulator: Int = x): Int ={
      if(i == 0) accumulator
      else loop(i - 1, y + accumulator)
    }
    loop(n)
  }

  println(repeatWord(counterOfNumber(100, 1, 5).toString,counterOfNumber(100, 1, 5).toString.length.toInt) + " is the result")

  def transform(aString: String)= {
    val aList = aString.split(" ").toList.reverse.mkString(" ").replaceAll("\\s+", " ")
    println(aList)
  }
  transform("I like  Scala")

}