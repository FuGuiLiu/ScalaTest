package com.sky.scala.exercise07

object Fbnq {
  def main(args: Array[String]): Unit = {
    //    println(fbnqCalculation(4))

    //    println(f(4))
    //    println(sum(4))
    println(eatPeach(1))
    println(eatDays(5 ))
  }

  def fbnqCalculation(num: Int): Int = {
    if (num == 1 || num == 2) {
      return 1
    } else {
      fbnqCalculation(num - 1) + fbnqCalculation(num - 2)
    }
  }

  def f(n: Int): Int = {

    if (n == 1) {
      3
    } else {
      2 * f(n - 1) + 1
    }
  }

  def sum(num: Int): Int = {
    if (num > 0) {

      num + sum(num - 1)
    } else {
      return 0
    }
  }

  def eatPeach(day: Int): Int = {
    if (day == 10) {
      1
    } else {
      (eatPeach(day + 1) + 1) * 2
    }
  }

  var count: Int = 1

  //根据桃子的数量查看能吃多少天
  def eatDays(peachs: Int): Int = {
    if (peachs / 2 - 1 == 0) {
      return count
    } else if (peachs / 2 - 1 == 1) {
      return count
    } else {
      count += 1
      eatDays(peachs / 2 - 1)
    }
  }
}
