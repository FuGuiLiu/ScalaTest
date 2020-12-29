package com.sky.scala.exercise02

object TypeDemo {
  def main(args: Array[String]): Unit = {
    //    var num: Int = 10
    //    println("转Double" + num.toDouble + "转String")

    sayHi()
    sayHi
    //    throwE()

    var num = 1.2
    var num02 = 1.2F
    num02 = num.toFloat
    //    num = num02
  }

  def sayHi(): Unit = {
    println("hi")
  }

  def throwE(): Nothing = {
    throw new Exception("自定义异常")
  }
}
