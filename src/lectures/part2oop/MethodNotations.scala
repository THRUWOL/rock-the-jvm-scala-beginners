package lectures.part2oop

object MethodNotations extends App {

  val mary = new Person("Mary", "Inception")
  val tom = new Person("Tom", "Fight Club")
  println(mary.likes("Inception"))
  println(mary likes "Inceptions")

  class Person(val name: String, favoriteMovie: String, val age: Int = 0) {
    def likes(movie: String): Boolean = movie == favoriteMovie

    def +(person: Person): String =
      s"${this.name} is hanging out with ${person.name}"

    def +(nickname: String): Person =
      new Person(s"$name ($nickname)", favoriteMovie)

    def unary_! : String = s"$name, what the heck?!"

    def unary_+ : Person = new Person(name, favoriteMovie, age + 1)

    def isAlive: Boolean = true

    def apply(): String = s"Hi, my name is $name and I like $favoriteMovie"
  }

  println(mary + tom)

  println((mary + "the Rockstar").apply())
  println((+mary).age)

}
