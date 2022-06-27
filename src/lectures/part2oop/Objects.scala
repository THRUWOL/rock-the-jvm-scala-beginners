package lectures.part2oop

object Objects extends App {

  object Person {
    val N_EYES = 2
    def canFly: Boolean = false

    def apply(mother: Person, father: Person): Person = new Person("Bobbie")
  }

  class Person(val name: String) {}

  val mary = Person
  val john = Person
  println(mary == john)

  val mary2 = new Person("Mary")
  val john2 = new Person("John")
  println(mary2 == john2)

  val bobbie = Person(mary2, john2)

}
