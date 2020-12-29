package com.sky.scala.exercise04

//乘法表
object MultiplicationTable {
  def main(args: Array[String]): Unit = {
    //    乘法表的行数
    val num = 9
    //    确定行数
    for (i <- 1 to num) {
      for (j <- 1 to i) {
        printf("%d * %d= %d\t", j, i, i * j)
      }
      println()
    }
  }
}
