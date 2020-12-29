package com.sky.scala.exercise08.methodTest

object MethodExercise {
  def main(args: Array[String]): Unit = {
    //    methodExec()
    val r = new Rectangle
    r.width = 2.0
    r.height = 2.0
    println(r.area())
  }

  def methodExec(): Unit = {
    for (i <- 1 to 10) {
      for (j <- 1 to 8) {
        print("*")
      }
      println()
    }
  }


}

class Rectangle {
  var height = 0.0
  var width = 0.0

  def area(): Double = {
    return (this.height * this.width / 2)
  }
}
