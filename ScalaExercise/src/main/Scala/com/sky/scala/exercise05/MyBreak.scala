package com.sky.scala.exercise05

import util.control.Breaks._

object MyBreak {
  def main(args: Array[String]): Unit = {
    /*breakable {
      for (i <- 0 to 10) {
        println("hello")
        if (i == 5) {
          break()
        }
      }
    }*/
    var flag: Boolean = true
    var sum = 0
    for (i <- 1 to 20 if flag) {
      sum += i
      if (sum > 20) {
        println("循环守卫中断")
        flag = false
      }
      println("i=" + i)
    }
  }
}
