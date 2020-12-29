package com.sky.scala.exercise.method

object ArrayCalculation {
  def main(args: Array[String]): Unit = {
    var myList: Array[Int] = Array(1, 23, 43, 354, 6)
    //    var totalCount = 0
    //    for (elem <- 0 to (myList.length - 1)) {
    //      totalCount += myList(elem)
    //    }
    //    println(totalCount)

    //    查找数组中的最大元素
    //    假如设置数组的第一个为最大值
    var ifMax: Int = myList(0)

    for (b <- 1 to (myList.length - 1)) {
      if (myList(b) > ifMax) {
        ifMax = myList(b)
      }
    }
    println(ifMax)
  }
}
