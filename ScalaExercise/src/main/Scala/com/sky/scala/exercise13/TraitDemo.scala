package com.sky.scala.exercise13

object TraitDemo {
  def main(args: Array[String]): Unit = {
    var sheep = new Sheep
    sheep.sayHi()
    sheep.sayHello()
  }
}

trait Trait {
  //  抽象方法
  def sayHi()

  //  普通方法
  def sayHello(): Unit = {
    println("hello 你好")
  }

}

class Sheep extends Trait {
  override def sayHi(): Unit = {
    println("小🐏say hi!~~~")
  }
}
