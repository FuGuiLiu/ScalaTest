package com.sky.scala.exercise15.tuple

object TupleDemo {
  def main(args: Array[String]): Unit = {
    val tuple = (1, 2, 3, "hello", 4)
    println(tuple)
    //    直接访问元素内容
    println(tuple._1)
    //    使用索引访问,走下标
    println(tuple.productElement(0))

    //    遍历元组
    for (item <- tuple.productIterator) {
      println(item)
    }

  }
}
