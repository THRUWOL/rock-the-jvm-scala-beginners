package StepikCourse.exercises

object LinkedList extends App {}

abstract class LogList[+A] {
  def last: Any
  def previous: LogList[A]
  def isEmpty: Boolean
  def all: String
  def add[B >: A](msg: B): LogList[B]
}

class Log[A](head: A, tail: LogList[A]) extends LogList[A] {
  override def last: A = head

  override def previous: LogList[A] = tail

  override def isEmpty: Boolean = false

  override def all: String = {
    s"${this.last} ${this.previous.all}"
  }

  override def add[B >: A](msg: B): LogList[B] = new Log(msg, this)
}

object Empty extends LogList[Any] {
  override def last: String = throw new NoSuchElementException

  override def previous: LogList[Any] = throw new NoSuchElementException

  override def isEmpty: Boolean = true

  override def all: String = ""

  override def add[B >: Any](msg: B): LogList[B] = new Log(msg, Empty)
}
