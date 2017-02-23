/**
  * Created by shubham.j on 23/02/17.
  */
class SplitList {
  def splitList(list : List[Any], count: Int) : List[List[Any]] = {
    if(list.length < count){
      println("List has less than " + count + " elements")
      return Nil
    }
    return List(list.take(count), list.drop(count))
  }
}
