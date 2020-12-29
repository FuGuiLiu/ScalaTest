package com.sky.scala.exercise07.functionDetails

object Details04 {
  def main(args: Array[String]): Unit = {
    println(sum(10, 1, 1, 1, 1, 1, 1))
    val f1 = "message"
    println(f1)
  }

  def sum(n1: Int, args: Int*): Int = {
    var sum = n1
    for (item <- args) {
      sum += item
    }
    println(args.length)
    return sum
  }
}
