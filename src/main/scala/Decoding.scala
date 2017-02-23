/**
  * Created by shubham.j on 23/02/17.
  */
class Decoding {
  def decoding(list : List[Any]) : List[Any] = {
    list match {
      case Nil => Nil
      case (element : List[Any]) :: tail => List.fill(element.head.toString.toInt)(element.tail.head.toString.toInt.toChar) ::: decoding(tail)
      case (element : Any) :: tail => List(element) ::: decoding(tail)
    }
  }
}
