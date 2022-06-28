package lectures.part2oop

object Inheritance extends App {

  class Animal {
    val creatureType = "wild"
    def eat = println("nomnom")
  }

  class Cat extends Animal {
    override def eat = { println("crunch crunch") }
  }

  val cat = new Cat

  class Person(name: String, age: Int) {
    def this(name: String) = this(name, 0)
    def this() = this("Bob", 18)
  }
  class Adult(name: String, age: Int, idCard: String) extends Person()

  class Dog(override val creatureType: String) extends Animal {
    override def eat = println("crunch crunch crunch")
  }

  val dog = new Dog("K9")
  dog.eat
  println(dog.creatureType)

  // полиморфизм
  val unknownAnimal: Animal = new Dog("55")
  unknownAnimal.eat
  println(unknownAnimal.creatureType)

  class CatT extends Cat

  val catt = new CatT {
    override def eat: Unit = super.eat
  }

  catt.eat
}
