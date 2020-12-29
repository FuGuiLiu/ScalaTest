package com.sky.scala.exercise15.map.dataProcess

object exercise04 {
  def main(args: Array[String]): Unit = {
    val list = List[Int](1, 3, 4, 5, 6)
    //  相加
    val i = list.reduceLeft(sum)
    println(i)
    val i_2 = list.reduceRight(sum)
    println(i_2)
    //  相减
    val i2 = list.reduceRight(subtract)
    println(i2)
    val i2_2 = list.reduceLeft(subtract)
    println(i2_2)

    //  求最大值或者最小值

    //  求最大值
    println(list.reduce(subtract))
    //  求最小值
    println(list.reduce(max))
  }

  //  相加
  def sum(n1: Int, n2: Int): Int = {
    return n1 + n2
  }

  //  相减
  def subtract(n1: Int, n2: Int): Int = {
    n1 - n2
  }

  //  求最大值或者最小值

  //  求最大值
  def mini(n1: Int, n2: Int): Int = {
    if (n1 > n2) {
      n1
    } else {
      n2
    }
  }

  //  求最小值
  def max(n1: Int, n2: Int): Int = {
    if (n1 > n2) {
      n2
    } else {
      n1
    }
  }
}
