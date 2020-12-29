package com.sky.scala.exercise13.homework


class ec02 {

}

class point(inX: Int, inY: Int) {
  var x: Int = inX
  var y: Int = inY
}

object point {
  def apply(inX: Int, inY: Int): point = new point(inX, inY)

  def main(args: Array[String]): Unit = {
    val p = point.apply(1, 2)
    val p2 = point.apply(3, 5)
    println(p.x,p.y)
    println(p2.x,p2.y)
  }
}
