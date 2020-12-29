package com.sky.scala.exercise17

object CurryDemo {
  def main(args: Array[String]): Unit = {
    def plus(n: Int)(n2: Int) = n * n2

    println(plus(10)(20))
  }
}
