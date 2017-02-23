/**
  * Created by shubham.j on 23/02/17.
  */
class KthElement {
  def kthElement(list : List[Any], k : Int) : List[Any] = {
    try{
      return List(list(k-1))
    }
    catch{
      case e : Exception => {
        println("List has less than " + k + " elements")
        return Nil
      }
    }
  }
}
