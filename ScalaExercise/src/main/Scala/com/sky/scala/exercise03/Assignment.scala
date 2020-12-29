package com.sky.scala.exercise03

object Assignment {
  def main(args: Array[String]): Unit = {
    var num = 2
    num <<= 2
    println("num值:" + num)
    var num2 = 2
    num2 <<= 3
    num2 >>= 1
    println("num2值:" + num2)
  }
}
