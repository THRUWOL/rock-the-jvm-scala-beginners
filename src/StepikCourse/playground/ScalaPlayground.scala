package StepikCourse.playground

import scala.io.StdIn._


object ScalaPlayground extends App {

  case class Course(title: String, instructor: String)

  object Course {
    def apply(instructor: String): Course = Course("AdvancedScala", instructor)
  }

}
