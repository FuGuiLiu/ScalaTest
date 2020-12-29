package com.sky.scala.exercise07.functionDetails

object Details02 {
  def main(args: Array[String]): Unit = {
    sayName("刘富贵")
  }

  def sayName(name: String = "柳风骨"): Unit = {
    return println(name + "hello")
  }
}
