import scala.util.Random
/**
  * Created by shubham.j on 23/02/17.
  */
class RandomElements {
  def randomElements(list : List[Any], count : Int) : List[Any] = {
    if(count > list.length){
      println("List size is less than " + count)
      return Random.shuffle(list)
    }
    return Random.shuffle(list).take(count)
  }
}
