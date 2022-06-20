package lectures.part1basics

object Functions extends App{

  def aFunction(a: String, b: Int):String = {
    a + " " + b
  }


  def aFunction2(): Int = 42
  println(aFunction2)

  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }

  println(aRepeatedFunction("test ", 5))

  // Если нужен цикл, то лучше использовать рекурсию

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b

    aSmallerFunction(n, n-1)
  }

  // task1
  def aGreetingFunction(name: String, age: Int): String =
    s"Hi, my name is $name and I am $age years old"

  println("task1: " + aGreetingFunction("Nikita", 19))

  // task2
  def aFactorialFunction(number: Int): BigInt={
    if (number == 0 || number == 1) 1
    else number * aFactorialFunction(number-1)
  }

  println("task2: " + aFactorialFunction(10))

  // task3
  def aFibonacciFunction(number: Int): BigInt={
    if (number == 1 || number == 2) 1
    else aFibonacciFunction(number-1) + aFibonacciFunction(number-2)
  }

  println("task3: " + aFibonacciFunction(12))

  // task4
  def aPrimeChecker(number: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean = {
      if (t <= 1) true
      else number % t != 0 && isPrimeUntil(t-1)
    }

    isPrimeUntil(number / 2)
  }

  print("task4: " + aPrimeChecker(7))

}
