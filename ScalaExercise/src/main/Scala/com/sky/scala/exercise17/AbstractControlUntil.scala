package com.sky.scala.exercise17

object AbstractControlUntil {
  def main(args: Array[String]): Unit = {
    var i = 10
    until(i > 0) {
      i -= 1
      println(i)
    }
  }

  def until(condition: => Boolean)(block: => Unit): Unit = {
    if (condition) {
      block
      until(condition)(block)
    }
  }
}
