package com.sky.scala.exercise03

object NumTest {
  def main(args: Array[String]): Unit = {
    var num = 97
    var weeks = num / 7
    var days = num - weeks * 7
    println(weeks)
    println(days)
  }
}
