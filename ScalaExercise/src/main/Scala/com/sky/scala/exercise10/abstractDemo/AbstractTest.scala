package com.sky.scala.exercise10.abstractDemo

object AbstractTest {
  def main(args: Array[String]): Unit = {
    val animal = new Cat
    animal.eat()
  }

  abstract class Animal() {
    def eat()

    var name: String
  }

  class Cat extends Animal {
    def eat(): Unit = {
      print(this.name + "吃饭...")
    }

    var name: String = "小花"
  }

}
