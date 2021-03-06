package com.shubham.examples.exceptionhandling

import scala.util.{Success, Failure, Try}


object UsingOptions {
  def convertToInt(str:String) : Option[Int] = {
    val integerValue = Try(str.toInt)
    integerValue match {
      case Failure(exception) =>
        println(s"Cannot convert $str to integer returning default value 0")
        None

      case Success(number) =>
        println(s"successfully converted string $str to integer")
        Some(number)
    }
  }



  def main(args: Array[String]): Unit = {
    val stringValue = "10"
    convertToInt(stringValue).getOrElse(0)

    val stringInvalidValue = "hello"
    convertToInt(stringInvalidValue).getOrElse(0)
  }
}
