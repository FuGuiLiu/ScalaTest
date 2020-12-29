package com.sky.scala.exercise08.oop

object OopTest {
  def main(args: Array[String]): Unit = {
    val a = new A
    println(a.name)
    println(a.name2)
    println(a.name3)
    println(a.name4)
    println(a.name5)
  }

  class Cat {
    var name = "小花"
    var age = 18
    var color = "red"

  }

  class A {
    var name: String = _
    var name2: Float = _
    var name3: Double = _
    var name4: Int = _
    var name5: Boolean = _
  }

}
