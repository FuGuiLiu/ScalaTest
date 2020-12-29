package com.sky.scala.exercise09.attribute

import scala.beans.BeanProperty

object AttributeTest {
  def main(args: Array[String]): Unit = {
    val worker = new Worker("smith")
    val worker2 = new Worker2("smith2")
    val worker3 = new Worker3("fugui")
    println(worker.name)
    println(worker2.inName)
    worker3.inName = "富贵"
    println(worker3.inName)
    println(worker3.getName)
  }
}

class Worker(inName: String) {
  var name = inName
}

class Worker2(val inName: String) {
  var name = inName
}

class Worker3(var inName: String) {
  @BeanProperty var name = inName
}