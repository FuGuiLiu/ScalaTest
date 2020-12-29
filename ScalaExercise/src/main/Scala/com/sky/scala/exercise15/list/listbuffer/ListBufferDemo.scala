package com.sky.scala.exercise15.list.listbuffer

import scala.collection.mutable.ListBuffer

object ListBufferDemo {
  def main(args: Array[String]): Unit = {
    //    创建一个listBuffer
    val listbuffer = ListBuffer[Int](1, 2, 3)
    //    访问
    println("liastbuffer第一个值为=" + listbuffer(0))
    //    遍历
    listbuffer.foreach(f1)

    println("============")
    //    追加元素
    //    2种方式  1. 使用 +=  2.使用 append
    var listbf02 = new ListBuffer[Int]
    listbf02 += 6
    listbf02.append(7)
    //    打印 listfb02里面的元素
    listbf02.foreach(f1)
    println("=================")
    //将 listbf02里面的元素赋给listbuffer
    listbuffer ++= listbf02
    println("listbuffer=" + listbuffer)
    println("============")
    //    删除某个元素
    listbuffer.remove(4)
    // 删除后进行展示
    listbuffer.foreach(f1)
  }

  def f1(num: Int): Unit = {
    println(num)
  }

}
