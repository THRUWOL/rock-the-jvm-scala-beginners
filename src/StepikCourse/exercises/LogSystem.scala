package StepikCourse.exercises

object LogSystem extends App{
  val logger = new Logger()

  logger.print

  logger.info.info.print
  logger.info(scala.io.StdIn.readInt()).print

}

/**
 * Позволяет получить информацию о текущем количестве сообщений в системе
 * Позволяет обрабатывать поступление сообщений
 * Позволяет обрабатывать поступление сразу нескольких сообщений
 */
class Logger(var msgNum: Int = 0){

  def info: Logger = {
    println(s"INFO New Message")
    new Logger(msgNum + 1)
  }
  def info(n: Int): Logger = {
    if(n <= 0) this
    else info.info(n-1)
  }

  def print = println(msgNum)

}
