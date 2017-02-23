/**
  * Created by shubham.j on 23/02/17.
  */
class DropElement {
  def dropElement(list : List[Any], count: Int) : List[Any] = {
    if(list.length < count)
      return list
    return list.take(count-1) ::: dropElement(list.drop(count),count)
  }
}
