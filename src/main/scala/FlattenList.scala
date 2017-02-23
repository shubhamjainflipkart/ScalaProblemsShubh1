/**
  * Created by shubham.j on 23/02/17.
  */
class FlattenList {
  def flattenList(list : List[Any]) : List[Any] = {
    list match {
      case Nil =>  Nil
      case (element : List[Any]) :: tail =>  (flattenList(element) ::: flattenList(tail))
      case (element : Any) :: tail =>  (List(element) ::: flattenList(tail))
    }
  }
}
