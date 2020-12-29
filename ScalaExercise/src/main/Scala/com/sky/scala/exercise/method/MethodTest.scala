package com.sky.scala.exercise.method

object MethodTest {
  def main(args: Array[String]): Unit = {
    var sum = MethodTest.addMethod(1, 2)
    print(sum)
  }

  def addMethod(a: Int, b: Int): Int = {
    return a + b
  }
}
