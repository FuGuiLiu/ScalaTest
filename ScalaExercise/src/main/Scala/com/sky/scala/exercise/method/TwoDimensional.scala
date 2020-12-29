package com.sky.scala.exercise.method

import java.util.Random

import Array._

object TwoDimensional {
  def main(args: Array[String]) {
    //    val dimArray = Array.ofDim[Int](3, 4)
    //    for (elem <- 0 to 2) {
    //      for (elem2 <- 0 to 3) {
    //        dimArray(elem)(elem2) = elem2
    //      }
    //    }
    //
    //    for (item <- 0 to 2) {
    //      for (item2 <- 0 to 3) {
    //        print("" + dimArray(item)(item2))
    //      }
    //      println()
    //    }

    var myList1 = Array(1.9, 2.9, 3.4, 3.5)
    var myList2 = Array(8.9, 7.9, 0.4, 1.5)

    var myList3 = concat(myList1, myList2)

    // 输出所有数组元素
    for (x <- myList3) {
      println(x)
    }
  }
}
