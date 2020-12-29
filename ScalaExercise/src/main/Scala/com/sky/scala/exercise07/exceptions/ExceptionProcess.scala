package com.sky.scala.exercise07.exceptions

object ExceptionProcess {
  def main(args: Array[String]): Unit = {
    var num01 = 0
    var num02 = 10
    try {
      println(num02 / num01)
    } catch {
      case exception: ArithmeticException => println("被除数不能为0")
    } finally {
      println("不管有没有异常都会执行")
    }
  }
}
