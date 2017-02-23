import scala.util.Random

/**
  * Created by shubham.j on 23/02/17.
  */
class RandomElementsInRange {
  def randomElementsInRange(count : Int, endPoint : Int) : List[Any] = {
    return Random.shuffle(List.range(1, endPoint + 1)).take(count)
  }
}
