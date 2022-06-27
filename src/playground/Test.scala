package playground

object Test extends App {
  val instructor: Instructor = new Instructor(1, "вася", "пупкин")
  println(instructor.fullName()) // Вася Пупкин

  val course: Course = new Course(2, "Course Name", "1234", instructor)
  println(course.instructor.fullName()) // Вася Пупкин
  println(course.getID) // 21
  println(course.isTaughtBy(instructor)) // true
  println(course.isTaughtBy(new Instructor(1, "Вася", "Пупкин"))) // false

  println(course.copyCourse("4321").releaseYear) // 4321
}

class ChecksumAccumulator {
  private var sum = 0

  def add(b: Byte): Unit = sum

  def checksum(): Int = ~(sum & 0xff) + 1
}

class Instructor(val id: Int, name: String, surname: String) {
  def fullName(): String = {
    val upperName = this.name(0).toString.toUpperCase() + this.name
      .replace(this.name(0).toString, "")
      .toLowerCase()
    val upperSurname = this.surname(0).toString.toUpperCase() + this.surname
      .replace(this.surname(0).toString, "")
      .toLowerCase()
    s"$upperName $upperSurname"
  }
}

class Course(
    courseId: Int,
    title: String,
    val releaseYear: String,
    val instructor: Instructor
) {
  def getID: String = s"$courseId${instructor.id}"

  def isTaughtBy(instructor: Instructor): Boolean =
    instructor.equals(this.instructor)

  def copyCourse(newReleaseYears: String): Course =
    new Course(courseId, title, newReleaseYears, instructor)
}
