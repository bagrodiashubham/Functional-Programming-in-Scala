package com.shubham.examples.exceptionhandling

import java.io.{IOException, FileNotFoundException, FileReader}


object ExceptionThrowing {
  def createFile(fileName:String): Unit = {
    if( ! (fileName endsWith ".scala") )
      throw new IllegalArgumentException("File name should end with .scala")
    //... rest of the program
  }

  def printFileContentFinally(fileName:String): Unit = {
    var file : FileReader = null
    try {
      file = new FileReader("input.txt")
      // read and print file content
    } catch {
      case ex: FileNotFoundException => // Handle missing file
      case ex: IOException => // Handle other I/O error
    } finally {
      file.close() //whether expression is thrown or not, file should be closed before control is transferred to caller method
    }
  }

  def convertToInt(str:String) : Int = {
    try{
      str.toInt
    } catch {
      case nfe : NumberFormatException =>
        throw new Exception(s"Cannot convert your input text '$str' to integer.")
    }
  }

  def main(args: Array[String]): Unit = {
    println(createFile("anyfile"))
    println(convertToInt("10"))
    println(convertToInt("wrong-input"))
    print(printFileContentFinally("wrongFileName"))
  }
}
