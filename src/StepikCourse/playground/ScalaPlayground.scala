package StepikCourse.playground

object ScalaPlayground extends App {

  abstract class BinaryTree[+T] {
    def value: T // значение узла
    def leftChild: BinaryTree[T] // левый потомок
    def rightChild: BinaryTree[T] // правый потомок

    def isEmpty: Boolean
    def isLeaf: Boolean

    def collectLeaves: List[BinaryTree[T]]
  }

  case class Node[+T](
      override val value: T,
      override val leftChild: BinaryTree[T],
      override val rightChild: BinaryTree[T]
  ) extends BinaryTree[T] {

    override def isEmpty: Boolean = false
    override def isLeaf: Boolean = leftChild == TreeEnd

    override def collectLeaves: List[BinaryTree[T]] = ???
  }

  case object TreeEnd extends BinaryTree[Nothing] {
    override def value: Nothing = throw new NoSuchElementException

    override def leftChild: BinaryTree[Nothing] =
      throw new NoSuchElementException

    override def rightChild: BinaryTree[Nothing] =
      throw new NoSuchElementException

    override def isEmpty: Boolean = true

    override def isLeaf: Boolean = false

    override def collectLeaves: List[BinaryTree[Nothing]] = List()
  }

  val tree = Node(
    1,
    Node(
      2,
      Node(4, TreeEnd, TreeEnd),
      Node(5, TreeEnd, Node(8, TreeEnd, TreeEnd))
    ),
    Node(3, Node(6, TreeEnd, TreeEnd), Node(7, TreeEnd, TreeEnd))
  )
}
