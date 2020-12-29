package com.sky.scala.exercise15.higherFunction

object HigherFunction02 {
  def main(args: Array[String]): Unit = {
    test(sayHello)
  }

  def test(f1PrintHello: () => Unit) = {
    f1PrintHello()
  }

  def sayHello(): Unit = {
    println("helloaaa")
  }
}
