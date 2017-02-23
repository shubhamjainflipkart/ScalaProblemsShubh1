/**
  * Created by shubham.j on 23/02/17.
  */
class SecondLastElement {
  def secondLastElement(list : List[Any]) : List[Any] = {
    try{
      return List(list.reverse.tail.head)
    }
    catch{
      case e : Exception => {
        println("List has less than two elements")
        return Nil
      }
    }
  }
}
