package com.sky.scala.exercise13.mixin

object MixinField {
  def main(args: Array[String]): Unit = {
    val l = new MySQL6 with DB6
    println(l.opertype)
  }
}

trait DB6 {
  var opertype: String = "insert"

  def insert(): Unit = {

  }
}

class MySQL6 {

}
