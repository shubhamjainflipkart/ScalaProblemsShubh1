/**
  * Created by shubham.j on 23/02/17.
  */
class EliminateConsecutiveDuplicates {
  def eliminateConsecutiveDuplicates(list : List[Any]) : List[Any] = {
    if(list.isEmpty || list.length == 1)
      return list
    if (list.head == list.tail.head)
      return  eliminateConsecutiveDuplicates(list.tail)
    else
      return (List(list.head) ::: eliminateConsecutiveDuplicates(list.tail))
  }
}
