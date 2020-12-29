package com.sky.scala.exercise13.mixin

object OverlayDemo {

  def main(args: Array[String]): Unit = {
    val l = new MySQL5 with DB5 with File5
    l.insert(123)
  }
}

trait Operate5 {
  println("构造函数。。。。。")

  def insert(id: Int)
}

trait File5 extends Operate5 {
  abstract override def insert(id: Int): Unit = {
    println("将数据保存到文件中！！！！")
    super.insert(id)
  }
}

trait DB5 extends Operate5 {
  override def insert(id: Int): Unit = {
    println("将数据保存到数据库中!!!!")
  }
}

class MySQL5 {

}