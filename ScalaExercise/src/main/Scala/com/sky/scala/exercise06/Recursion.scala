package com.sky.scala.exercise06

object Recursion {
  def main(args: Array[String]): Unit = {
    test(4)
    test2(4)
  }

  def test(n1: Int) {
    if (n1 > 2) {
      test(n1 - 1)
    }
    println("n1=" + n1)
  }

  def test2(n2: Int) {
    if (n2 > 2) {
      test2(n2 - 1)
    } else {
      println("n2=" + n2)
    }
  }
}
