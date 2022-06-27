package lectures.part2oop

object OOBasics extends App {

  new Writer("", "", 0)

  class Writer(firstName: String, surname: String, val year: Int) {
    def fullName: String = firstName + " " + surname
  }

  class Novel(name: String, year: Int, author: Writer) {
    def authorAge: Int = year - author.year
    def isWrittenBy(author: Writer): Boolean = author == this.author
    def copy(newYear: Int): Novel = new Novel(name, newYear, author)
  }

}
