package com.sky.scala.exercise11.work

object Apply {
  def apply(x: Int, y: Int): Apply = new Apply(x, y)

  def main(args: Array[String]): Unit = {
    val apply = Apply(1, 4)
    println(apply.x1)
    println(apply.y1)
    println(Apply(2, 4))
    println(Apply(43, 43))
  }
}

class Apply(x: Int = 0, y: Int = 0) {
  var x1 = x
  var y1 = y
}
