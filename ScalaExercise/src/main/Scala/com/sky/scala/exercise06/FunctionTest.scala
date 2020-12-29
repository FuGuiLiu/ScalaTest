package com.sky.scala.exercise06

object FunctionTest {
  def main(args: Array[String]): Unit = {

    val n1 = 1
    val n2 = 2

    println(sum(n1, n2, 'b'))

  }

  def sum(n1: Int, n2: Int, aType: Char) = {
    if (aType == '+') {
      n1 + n2
    } else if (aType == '-') {
      n1 - n2
    } else {
      null
    }
  }
}
