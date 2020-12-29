package com.sky.scala.exercise03

object Change {
  def main(args: Array[String]): Unit = {
    var a = 20
    var b = 10

    println(a + b)
    a = a + b - a
    b = a + b - b

    println("交换后a的值" + ((a + b) - a))
    println("交换后b的值" + ((a + b) - b))

    if (a > b) println("大于") else println("小于")
  }
}
