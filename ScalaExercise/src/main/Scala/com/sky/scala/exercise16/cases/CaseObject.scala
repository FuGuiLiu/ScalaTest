package com.sky.scala.exercise16.cases

object CaseObject {
  def main(args: Array[String]): Unit = {
    println("test")
    var dollar = new Dollar(1.1)

  }

  abstract class Amount

  case class Dollar(value: Double) extends Amount

  case class Currency(value: Double, unit: String) extends Amount

  case object NoAmount extends Amount

}
