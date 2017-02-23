/**
  * Created by shubham.j on 23/02/17.
  */
class RemoveElement {
  def removeElement(list : List[Any], count : Int) : List[Any] = {
    if(list.length < count){
      println("List size is less than " + count)
      return list
    }
    return list.take(count-1) ::: list.drop(count)
  }
}
