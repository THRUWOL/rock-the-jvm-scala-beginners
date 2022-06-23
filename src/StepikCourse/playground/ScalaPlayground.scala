package StepikCourse.playground

object ScalaPlayground extends App {
  trait Iterator[A] {
    def hasNext: Boolean
    def next(): A
  }

  trait Test[B]{
    def bbb(): Unit ={
      print("aaa")
    }
  }

  trait Test2{
    def c()
  }

  class Tester extends Iterator[String] with Test[Int] with Test2{
    override def hasNext: Boolean = ???

    override def next(): String = ???

    override def c(): Unit = ???
  }

  val test2323 = new Tester


}
