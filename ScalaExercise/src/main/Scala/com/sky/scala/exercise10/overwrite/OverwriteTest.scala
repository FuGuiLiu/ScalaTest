package com.sky.scala.exercise10.overwrite

object OverwriteTest extends App  {

  class Person {
    var name = "tom"

    def printName(): Unit = {
      println("name" + name)
    }
  }

  class XM extends Person() {
    override def printName(): Unit = {
      println("XM")
      super.printName()
    }
  }

  var xm = new XM
  xm.printName()
}
