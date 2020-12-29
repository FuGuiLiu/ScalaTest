package com.sky.scala.exercise15.view

object ViewDemo {
  def main(args: Array[String]): Unit = {
    //    没有使用view时
    //    val value = (1 to 100).filter(isMultiNum)
    //    for (item <- value) {
    //      println(item)
    //    }
    //    使用view做缓冲

    val viewValue = (1 to 100).view.filter(isMultiNum)
    println(viewValue)
//    for (item <- viewValue) {
//      println(item)
//    }
  }

  def isMultiNum(i: Int): Boolean = {
    i.toString.equals(i.toString.reverse)
  }
}
