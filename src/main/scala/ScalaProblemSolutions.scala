/**
  * Created by shubham.j on 23/02/17.
  */
object ScalaProblemSolutions extends App{

//  PROBLEM 1
//  var list : List[Int] = List.range(1,2)
//  var secondLastElementObject = new SecondLastElement()
//  println(secondLastElementObject.secondLastElement(list))
//
//  PROBLEM 2
//  var list : List[Int] = List(1,2,3,4,5,6)
//  var kthElementObject = new KthElement()
//  println(kthElementObject.kthElement(list, 8))
//
//  PROBLEM 3
//  var list : List[Int] = List()
//  var elementsCountObject = new ElementsCount()
//  println(elementsCountObject.elementsCount(list))
//
//  PROBLEM 4
//  var list : List[Int] = List(1,2,3,4)
//  var reverseElementsObject = new ReverseElements()
//  println(reverseElementsObject.reverseElements(list))
//
//  PROBLEM 5
//  var list : List[Int] = List()
//  var palindromeObject = new Palindrome()
//  println(palindromeObject.palindrome(list))
//
//  PROBLEM 6
//  var list = List(1,List(2,List(3,4),5,6),7,List(8,9))
//  var flattenListObject = new FlattenList()
//  println(flattenListObject.flattenList(list))

//  PROBLEM 7
  var list : List[Any] = List(1,1,2,2,2,2,3,4,4)
  var eliminateConsecutiveDuplicatesObject = new EliminateConsecutiveDuplicates()
  println(eliminateConsecutiveDuplicatesObject.eliminateConsecutiveDuplicates(list))

//  PROBLEM 8
//  var list : List[Any] = List(1,1,2,2,2,2,3,4,4)
//  var packSameConsecutiveElementsObject = new PackSameConsecutiveElements()
//  println(packSameConsecutiveElementsObject.packSameConsecutiveElements(list))
//
//  PROBLEM 9
//  var runLengthEncodingObject = new RunLengthEncoding()
//  var listTmp : List[List[Any]] = runLengthEncodingObject.packSameConsecutiveElements(list)
//  println(listTmp.map(runLengthEncodingObject.runLengthEncoding(1,_)))
//
//  PROBLEM 11
//  var list : List[Any] = List('a','a','b','b','b','b','c','d','d')
//  var runLengthEncodingObject = new RunLengthEncoding()
//  var listTmp : List[List[Any]] = runLengthEncodingObject.packSameConsecutiveElements(list)
//  println(listTmp.map((element : List[Any]) => if(element.length == 1) element.head else runLengthEncodingObject.runLengthEncoding(1,element)))
//
//  PROBLEM 12
//  var list : List[Any] = List(List(2,'a'), List(4,'b'), 'c', List(2,'d'))
//  var decodingObject = new Decoding()
//  println(decodingObject.decoding(list))
//
//  PROBLEM 13
//  var list : List[Any] = List('a','a','b','b','b','b','c','d','d')
//  var directEncodingObject = new DirectEncoding()
//  println(directEncodingObject.directEncoding(list))
//
//  PROBLEM 14
//  var list = List(1,2,3,4,5)
//  var duplicateElementsObject = new DuplicateElements()
//  println(duplicateElementsObject.duplicateElements(list))
//
//  PROBLEM 15
//  var list = List(1,2,3)
//  var replicateElementsObject = new ReplicateElements()
//  println(replicateElementsObject.replicateElements(list, 4))
//
//  PROBLEM 16
//  var list = List(1,2,3,4,5,6,7,8)
//  var dropElementObject = new DropElement()
//  println(dropElementObject.dropElement(list, 3))
//
//  PROBLEM 17
//  var list = List(1,2,3,4,5,6,7,8)
//  var splitListObject = new SplitList()
//  println(splitListObject.splitList(list, 6))
//
//  PROBLEM 18
//  var list = List(1,2,3,4,5,6,7,8)
//  var listSliceObject = new ListSlice()
//  println(listSliceObject.listSlice(list, 8, 9))
//
//  PROBLEM 19
//  var leftRotateObject = new LeftRotate()
//  println(leftRotateObject.leftRotate(list, 10))
//  println(leftRotateObject.leftRotate(list, -10))
//
//  PROBLEM 20
//  var list : List[Any] = List(1,2, List(3,4), 5,6,7,8)
//  var removeElementObject = new RemoveElement()
//  println(removeElementObject.removeElement(list, 3))
//
//  PROBLEM 21
//  var list : List[Any] = List(1,2,3,4)
//  var insertElementObject = new InsertElement()
//  println(insertElementObject.insertElement(list, List('a','b'), 3))
//
//  PROBLEM 22
//  var rangeListObject = new RangeList()
//  println(rangeListObject.rangeList(4,9))
//
//  PROBLEM 23
//  var list : List[Any] = List(1,2,3,4,5,6,7,8)
//  var randomElementsObject = new RandomElements()
//  println(randomElementsObject.randomElements(list, 3))
//
//  PROBLEM 24
//  var randomElementsInRangeObject = new RandomElementsInRange()
//  println(randomElementsInRangeObject.randomElementsInRange(6, 49))
//
//  PROBLEM 25
//  var list : List[Any] = List(1,2,3,4,5)
//  var permutationObject = new Permutation()
//  println(permutationObject.permutation(list))
}
