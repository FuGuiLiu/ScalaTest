package com.sky.scala.exercise15.set

import scala.collection.mutable.Set

object SetDemo {
  def main(args: Array[String]): Unit = {
    val set = Set("阿迪斯", "asdf", "现场v吧", "zhan神")
    //    方式一
    set += "富贵"
    //    方式二
    set.+=("hello")

    println(set)
    println("删除操作=============")
    //    删除操作
    //    方式一
    set.remove("富贵")
    //    方式二
    set -= "hello"
    println(set)

    println("set集合的遍历")
    //    遍历
    //    直接使用for进行遍历
    for (s <- set) {
      println(s)
    }
  }
}
