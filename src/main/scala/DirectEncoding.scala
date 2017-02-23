/**
  * Created by shubham.j on 23/02/17.
  */
class DirectEncoding {
  def directEncoding(list : List[Any]) : List[Any] = {
    if(list.isEmpty || list.length == 1)
      return list
    var listTmp = directEncoding(list.tail)
    listTmp match {
      case Nil => Nil
      case (element : List[Any]) :: tail => if(list.head == element.last) List(List(element.head.toString.toInt + 1, list.head)) ::: tail else List(list.head) ::: listTmp

      case (element : Any) :: tail =>  if(list.head == element) List(List(2, element)) ::: tail else List(list.head) ::: listTmp
    }
  }
}
