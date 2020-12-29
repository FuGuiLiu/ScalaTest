package com.sky.scala.exercise06

object MethodAndFunction {
  def main(args: Array[String]): Unit = {
    val dog = new Dog
    val i = dog.add(1, 2)
    //    把方法转成函数
    var f1 = dog.add _
    println(i)
    println("f1=" + f1)
    println("f1=" + f1.apply(1, 5))

    var f2 = (n1: Int, n2: Int) => {
      n1 + n2
    }
    println("f2=" + f2.apply(1, 1))
  }
}

class Dog {
  def add(num1: Int, num2: Int): Int = {
    return num1 + num2
  }
}
