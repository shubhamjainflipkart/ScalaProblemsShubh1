import scala.util.Random

/**
  * Created by shubham.j on 23/02/17.
  */
class Permutation {
  def permutation(list : List[Any]) : List[Any] = {
    return Random.shuffle(list)
  }
}
