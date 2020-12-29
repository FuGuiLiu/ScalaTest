package com.sky.scala.exercise14

object Implicit {
  def main(args: Array[String]): Unit = {
    implicit def toInt(num: Double): Int = {
      return num.toInt
    }

    var num: Int = 3.3
    var num2: Int = 31.3
    println(num + num2)
  }
}
