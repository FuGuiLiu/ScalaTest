package com.sky.scala.exercise.method

object StingTest {
  def main(args: Array[String]) {
    val myString: String = "world"
    val buf = new StringBuilder;
    buf ++= "hello!!!"
    buf ++= myString
    var z: Array[String] = new Array[String](100)
    var x: Array[String] = new Array(100)
    var c = Array("a", "b", "c")
    var mu: String = null
    for (mu
           <- c
         ) {
      print(c.toString)
    }
  }
}