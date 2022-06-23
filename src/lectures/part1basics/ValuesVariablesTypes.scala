package lectures.part1basics

object ValuesVariablesTypes extends App {
  // Val`s нельзя изменять (аля константа)
  val x: Int = 42;
  println(x)

  // Компилятор может узнать какой тип данных используется в зависимости от значения (можно не указывать тип)
  val y = "45"
  println(y)

  val aString: String = "abc"
  val aString2 = "test"

  val aBoolean: Boolean = true
  val aBoolean2 = false

  val aChar: Char = 'a'
  val aChar2 = 'b'

  val aInt: Int = 999999999
  val aInt2 = 45

  val aShort: Short = 9999
  val aShort2 = 9999

  val aLong: Long = 999999999999999999L
  val aLong2 = 999999999999999999L

  val aFloat: Float = 2.0f
  val aFloat2 = 2.0f

  val aDouble: Double = 222.0
  val aDouble2 = 222.0

  // Изменяемые переменные обозначаются словом "var"
  var aVariable: Int = 55
  aVariable = 65

  println(aVariable)

  // Предпочтительней использовать val, так что если есть возможность
  // не использовать var, то лучше использовать val

  val first, second: String = "Test"
  println(first + second)

  var test = "Test".intersect("test")

  println(test)

}
