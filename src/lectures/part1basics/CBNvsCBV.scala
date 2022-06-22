package lectures.part1basics

object CBNvsCBV extends App {
  def calledByValue(x: Long): Unit = {
    println("value: " +x)
    println("value: " +x)
  }

  def calledByName(x: => Long): Unit = {
    println("name: " + x)
    println("name: " + x)
  }

  calledByValue(System.nanoTime())
  calledByName(System.nanoTime())
}
