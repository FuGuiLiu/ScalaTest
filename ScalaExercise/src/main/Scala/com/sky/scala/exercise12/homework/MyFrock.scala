package com.sky.scala.exercise12.homework

import com.sky.scala.exercise11.work.Apply

import scala.beans.BeanProperty

object MyFrock {
  var name: String = _

  def apply(): MyFrock = new MyFrock()

  def main(args: Array[String]): Unit = {
    var mf = MyFrock()
    var mf2 = MyFrock()
    var mf3 = MyFrock()
    println(mf.getSerialNumber)
    println(mf2.getSerialNumber)
    println(mf3.getSerialNumber)
  }
}

class MyFrock() {
  private var currentNum = 100000

  @BeanProperty
  var serialNumber: Int = this.getNetNum()

  def getNetNum(): Int = {
    this.currentNum += 100
    return currentNum
  }
}
