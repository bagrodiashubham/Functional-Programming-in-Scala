package com.shubham.examples.implicits


object Implicits {
  case class Text(value : String)

  case class Source(sourceName : String){
    def sendText(t:Text): Unit = println(s"Text is coming from $sourceName and its value is ${t.value}")
  }

  def communicateFrom1(t:Text)(implicit s:Source): Unit = s.sendText(t)

  def main(args: Array[String]): Unit = {

    implicit val defaultSource: Source = Source("default source")

    communicateFrom1(Text("1st message"))

    val newSource = Source("new source")

    communicateFrom1(Text("2nd message"))(newSource)

  }

}
