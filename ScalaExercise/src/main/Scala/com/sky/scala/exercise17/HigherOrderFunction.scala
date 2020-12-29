package com.sky.scala.exercise17

object HigherOrderFunction {
  def main(args: Array[String]): Unit = {
    //    高阶函数可以嵌套多个函数
    def test(f1: Double => Double, d: Double): Double = {
      f1(mod(d))
    }

    def sum(d: Double): Double = {
      d + d
    }

    def mod(d2: Double): Double = {
      d2 % 2
    }

    println(test(sum, 100))
  }
}
