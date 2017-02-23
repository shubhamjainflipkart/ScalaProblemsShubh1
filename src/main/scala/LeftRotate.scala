/**
  * Created by shubham.j on 23/02/17.
  */
class LeftRotate {
  var count = 0
  def leftRotate(list : List[Any], count : Int) : List[Any] = {
    if(count < 0)					//count is considered val so can't be changed
      this.count = list.length + (count % list.length)
    else
      this.count = count % list.length
    return list.drop(this.count) ::: list.take(this.count)
  }
}
