package StepikCourse.lectures.week1basics

object TypesValuesVariables extends App {

  val aString: String = "Hello"
  println(aString)

  println(println(aString.getClass).getClass)

  val x: Unit = 56

  print(x)

  class Test(var x: Int , var y:String){
    def this(x:Int){
      this(x,"")
      print("X")
    }
    def this(){
      this(0,"")
      print("Empty")
    }

  }

  val test1 = new Test(5)

  println(test1)
}
