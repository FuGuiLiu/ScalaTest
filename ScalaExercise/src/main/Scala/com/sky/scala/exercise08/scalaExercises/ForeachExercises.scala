package com.sky.scala.exercise08.scalaExercises

import java.util.function.BiConsumer

object ForeachExercises {
  def main(args: Array[String]): Unit = {
    //    var sigNum = fun1(-1)
    //    print(sigNum)
    //    fun02()
    //    fun03()
    //    fun04CountDown(10)
    //    fun04CountDown_3
    //    fun05("Hello")
    //    val str = "hello"
    //    println(str.charAt())
    var res: Long = 1L
    "Hello".foreach(fun06)
    println(res)

    def fun06(char: Char): Unit = {
      res *= char.toLong
    }

    "Hello".foreach(res *= _.toLong)
    println("res=" + res)
    println(fun07("Hello"))
    println(fun08(24, 2))

    //  一个数如果为正数,则它的 signum为1;如果为复数signum为-1;如果为0,则signum为0编写一个函数来计算这个值
    def fun1(n1: Int): Int = {
      if (n1 >= 1) {
        1
      } else if (n1 == 0) {
        0
      } else {
        -1
      }
    }

    def fun02(): Unit = {
      val `{}` = {}
      println(`{}`.isInstanceOf[Unit] + " " + `{}`)
    }

    def fun03() {
      for (i <- 1 to 10) {
        println(i)
      }
    }

    def fun04CountDown(n: Int): Int = {
      if (n == 0) {
        println(0)
        0
      } else {
        println(n)
        fun04CountDown(n - 1)
      }
    }

    def fun04CountDown_2(): Unit = {
      (0 to 10).reverse.foreach(println)
    }

    def fun04CountDown_3(): Unit = {
      (0 to 10).reverse.foreach(myShow)
    }

    def myShow(num: Int): Unit = {
      println(num)
    }

    def fun05(str: String): Unit = {
      var res: Long = 1L
      for (i <- 0 until str.length) {
        res *= str.charAt(i).toLong
      }
      println(res)
    }

    def fun07(str: String): Long = {
      if (str.length == 1) {
        str.charAt(0).toLong
      } else {
        str.take(1).charAt(0).toLong * fun07(str.drop(1))
      }
    }

    def fun08(x: Double, n: Int): Double = {
      if (n == 0) {
        1
      } else if (n > 0) {
        x * fun08(x, n - 1)
      } else {
        1 / fun08(x, -n)
      }

    }
  }
}