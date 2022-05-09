package com.shubham.examples.transformations


object SimpleTransformations {
  def main(args: Array[String]): Unit = {
    val integerList = List(1,2,3,4)
    println("Integer list value is "+integerList)

    val mappedList = integerList.map(element =>  element+1)
    println("Updated integer list is "+mappedList)

    var copiedList : List[Int] = Nil
    integerList.foreach(element => copiedList :+= element)
    println("copied list is "+copiedList)

    val firstTwoElements = integerList.take(2)
    println("list with first 2 elements are "+firstTwoElements)

    val listOfList = List(List(1,2),List(3,4))
    println("list of list is "+listOfList)

    val flattenedList = listOfList.flatten
    println("flattened list is "+flattenedList)

    val flatMappedList = listOfList.flatten
    println("flat mapped list "+flatMappedList)

  }
}
