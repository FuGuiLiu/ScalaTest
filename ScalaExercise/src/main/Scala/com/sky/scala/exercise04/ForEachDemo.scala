package com.sky.scala.exercise04

object ForEachDemo {
  def main(args: Array[String]): Unit = {
    val res = for (i <- 1 to 10) yield {
      if (i % 2 == 0) {
        i
      } else {
        "不是偶数"
      }
    }
    println("----------------------")
    println(res)
  }

  for {
    i <- 0 until 3
    j <- 0 until 3
  } {
    println("ij"+i, j)
  }
}
