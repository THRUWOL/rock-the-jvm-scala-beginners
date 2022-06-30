package exercises

object RationalApp extends App {
  val first = new Rational(1, 2)

}

class Rational(n: Int, d: Int) {
  override def toString: String = s"$n/$d"
}
