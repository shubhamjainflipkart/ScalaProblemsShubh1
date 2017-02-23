/**
  * Created by shubham.j on 23/02/17.
  */
class ReplicateElements {
  def replicateElements(list : List[Any], count: Int) : List[Any] = {
    if(list.isEmpty)
      return Nil
    return List.fill(count)(list.head) ::: replicateElements(list.tail, count)
  }
}
