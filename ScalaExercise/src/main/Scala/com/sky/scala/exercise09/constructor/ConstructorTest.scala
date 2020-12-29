package com.sky.scala.exercise09.constructor

object ConstructorTest {
  def main(args: Array[String]): Unit = {
    var p = new Person("小明")
    println(p.toString)
  }
}

//构造器快熟入门
class Person(inName: String, inAge: Int) {
  var name: String = inName
  var age: Int = inAge
  age += 10
  println("name=" + name)
  println("~~~~~~~~~~~~~~~~~~~~~~~~~~")

  override def toString: String = {
    "name=" + this.name + "\t" + "age=" + this.age
  }

  def this(name: String) {
    this("jack", 18)
    this.name = name
  }

  println("age=" + age)
}