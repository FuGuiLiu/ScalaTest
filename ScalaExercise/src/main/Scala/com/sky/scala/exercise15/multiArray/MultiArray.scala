package com.sky.scala.exercise15.multiArray

object MultiArray {
  def main(args: Array[String]): Unit = {
    //    定义多维数组
    val multiArray = Array.ofDim[Int](3, 4)
    //    循环遍历
    for (elem <- multiArray) {
      for (elem2 <- elem) {
        print(elem2 + "\t")
      }
      println()
    }
    //    指定取出
    println(multiArray(0)(3))
    //    修改值
    multiArray(0)(3) = 100
    //    重新循环打印
    println("=====================================")
    for (elem <- multiArray) {
      for (elem2 <- elem) {
        print(elem2 + "\t")
      }
      println()
    }
  }
}
