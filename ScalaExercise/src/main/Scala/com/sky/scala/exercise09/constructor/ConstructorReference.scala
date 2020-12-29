package com.sky.scala.exercise09.constructor

object ConstructorReference {
  def main(args: Array[String]): Unit = {
    val b = new B("富贵")
    println(b)
  }
}

class A {
  println("~~AA~~")
}

class B() extends A {
  println("!!BBB")

  def this(name: String) {
    this
    println("(name:String)" + name)
  }
}