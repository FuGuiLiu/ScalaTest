package com.sky.scala.exercise04

import scala.io.StdIn

object InputTest {
  def main(args: Array[String]): Unit = {
    println("请输入名称")
    var name = StdIn.readLine()
    println("请输入年龄")
    var age = StdIn.readLine()
    println("请输入薪水")
    var salary = StdIn.readLine()
    printf(s"名称为为:${name},年龄为:${age},薪水为:${salary}")
    //    Dog.sayHello
    //    Dog.speak
  }

  object Dog extends AAA {
    def sayHello: Unit = {
      println("hello")
    }
  }

  trait AAA {
    def speak: Unit = {
      print("speak aaa")
    }
  }

}
