package com.sky.scala.exercise15.higherFunction

object HigherFunction {
  def main(args: Array[String]): Unit = {
    println(test(sum, 100))
  }

  def test(f: Double => Double, n1: Double) = {
    f(n1)
  }

  def sum(d: Double): Double = {
    d + d
  }
}
