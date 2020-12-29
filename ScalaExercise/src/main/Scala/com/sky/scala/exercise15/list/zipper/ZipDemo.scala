package com.sky.scala.exercise15.list.zipper

object ZipDemo {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3)
    val list02 = List(4, 5, 6)
    val list03 = list.zip(list02)

    for (item <- list03) {
      println(item._1, item._2)
    }
  }
}
