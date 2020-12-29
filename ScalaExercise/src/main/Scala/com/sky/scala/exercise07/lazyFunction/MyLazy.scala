package com.sky.scala.exercise07.lazyFunction

object MyLazy {
  def main(args: Array[String]): Unit = {
    lazy val i = sum(1, 2)
    println("==============================")
    println(i)
  }

  def sum(n1: Int, n2: Int): Int = {
    println("结果进行计算。。。。。。。。。。。。。")
    return n1 + n2
  }
}
