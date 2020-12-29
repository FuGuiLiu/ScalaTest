package com.sky.scala.exercise16.typematch

object TypeMatchDemo {
  def main(args: Array[String]): Unit = {
    val oper = "-"
    val n1 = 100
    val n2 = 200

    oper match {
      case "+" => {
        println(n1 + n2)
      }
      case "-" => {

        println(n1 - n2)
      }
      case "*" => {
        println(n1 * n2)
      }
      case "/" => {
        println(n1 / n2)
      }
      case _ => {
        println("输入错误")
      }
    }
  }
}
