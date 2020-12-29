package com.sky.scala.exercise10.superClass

object SuperClass {
  def main(args: Array[String]): Unit = {
    var a: A = new A
    var a2: A = new B
    a.sayHello()
    a2.sayHello()
  }

  class A {
    def sayHello(): Unit = {
      println("helloa")
    }
  }

  class B extends A {
    override def sayHello(): Unit = {
      println("hellob")
    }
  }

}
