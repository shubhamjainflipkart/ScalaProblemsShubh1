/**
  * Created by shubham.j on 23/02/17.
  */
class DuplicateElements {
  def duplicateElements(list : List[Any]) : List[Any] = {
    if(list.isEmpty)
      return Nil
    return List.fill(2)(list.head) ::: duplicateElements(list.tail)
  }
}
