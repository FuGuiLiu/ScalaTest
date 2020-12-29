package com.sky.scala.exercise12.mixin

object MixInDemo {
  def main(args: Array[String]): Unit = {
    val b = new OracleDB with Operate3
    b.insert(111)

    var mysql3_ = new MySQL3_ with Operate3 {
      override def sayHi(): Unit = {
        println("hello")
      }
    }
    mysql3_.sayHi()
    mysql3_.insert(1213)
  }
}

trait Operate3 {
  def insert(id: Int): Unit = {
    println("插入数据=" + id)
  }
}

class OracleDB {

}

abstract class MySQL3 {

}

abstract class MySQL3_ {
  def sayHi()
}
