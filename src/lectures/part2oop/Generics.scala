package lectures.part2oop

object Generics extends App {
  case class Pet(name: String, says: String)
  val pet = Pet("Rex", "011")
  // Ваш код
  val kind = pet match {
    case Pet(_, "meow" | "nya") => "cat"
    case Pet(_, "[01]+")        => "robot"
    case Pet("Rex", _)          => "dog"
    case _                      => "unknown"

  }
  println(kind)
}
