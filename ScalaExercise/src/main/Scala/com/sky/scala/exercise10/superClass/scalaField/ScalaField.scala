package com.sky.scala.exercise10.superClass.scalaField

import scala.beans.BeanProperty

object ScalaField {
  def main(args: Array[String]): Unit = {
    val a: AAA = new BBB
    println(a.sayName("aa"))
  }

  class AAA {
    def sayName(s: String): String = {
      return "富贵"
    }
  }

  class BBB extends AAA {
    def sayName(): String = {
      return "刘富贵"
    }

    override def sayName(s: String): String = {
      return "刘富贵"
    }
  }

}
