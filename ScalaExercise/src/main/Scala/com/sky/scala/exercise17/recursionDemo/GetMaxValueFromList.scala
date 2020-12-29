package com.sky.scala.exercise17.recursionDemo

//从集合中获取最大的值
object GetMaxValueFromList {
  def main(args: Array[String]): Unit = {
    val list = List(2, 5, 1)
    println(getMaxValueFromList(list))
  }

  def getMaxValueFromList(list: List[Int]): Int = {
    if (list.isEmpty) {
      throw new RuntimeException
    } else if (list.size == 1) {
      list(0)
    } else if (list.head > getMaxValueFromList(list.tail)) {
      list.head
    } else {
      getMaxValueFromList(list.tail)
    }
  }
}
