/**
  * Created by shubham.j on 23/02/17.
  */
class ListSlice {
  def listSlice(list : List[Any], start: Int, end : Int) : List[Any] = {
    if(list.length < end || start > end){
      println("List can't be sliced with given parameters")
      return Nil
    }
    return list.drop(start - 1).dropRight(list.length - end - 1)
  }
}
