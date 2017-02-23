/**
  * Created by shubham.j on 23/02/17.
  */
class InsertElement {
  def insertElement(list : List[Any], element : Any, count : Int) : List[Any] = {
    if(list.length < count){
      println("List size is less than " + count)
      return list
    }
    return list.take(count - 1) ::: List(element) ::: list.drop(count - 1)
  }
}
