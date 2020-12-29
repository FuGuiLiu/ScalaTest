package com.sky.scala.exercise07.functionTest

import scala.io.StdIn

object pyramidPrint {
  def main(args: Array[String]): Unit = {
    printPyramid
    //    a
    //    cfb()
  }

  def printPyramid() {
    println("请输入金字塔的高度")
    var height: Int = StdIn.readInt()
    for (i <- 1 to height) {
      for (j <- 1 to (height - i)) {
        print("                ")
      }
      for (k <- 1 to i) {
        print("李威是个low比")
      }
      println()
    }
  }

  def cfb() {
    for (i <- 1 to 9) {
      println()
      for (j <- 1 to i) {
        printf("%d * %d = %d\t", j, i, j * i)
      }
    }
  }
}
