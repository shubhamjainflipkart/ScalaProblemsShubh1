/**
  * Created by shubham.j on 23/02/17.
  */
class PackSameConsecutiveElements {
  def packSameConsecutiveElements(list : List[Any]) : List[List[Any]] = {
    if(list.isEmpty || list.length == 1)
      return List(list)
    var listTmp = packSameConsecutiveElements(list.tail)
    if (list.head == listTmp.head.head)
      return  List(List(list.head) ::: listTmp.head) ::: listTmp.tail
    else
      return List(List(list.head)) ::: listTmp
  }
}
