/**
  * Created by shubham.j on 23/02/17.
  */
class Palindrome {
  def palindrome(list : List[Any]) : Boolean = {
    return list.dropRight(list.length / 2) == list.drop(list.length / 2).reverse
  }
}
