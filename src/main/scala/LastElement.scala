/**
  * Created by shubham.j on 23/02/17.
  */
class LastElement {
  def lastElement(list: List[Any]): List[Any] = {
    try {
      return List(list.last)
    }
    catch {
      case e: NoSuchElementException => {
        println("List is empty")
        return Nil
      }
    }
  }
}
