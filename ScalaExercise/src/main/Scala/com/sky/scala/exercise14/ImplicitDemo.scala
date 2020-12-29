package com.sky.scala.exercise14

object ImplicitDemo {
  def main(args: Array[String]): Unit = {
    implicit def addDelete(mySQL: MySQL): DB = {
      return new DB()
    }

    val mysql = new MySQL
    mysql.insert()
    mysql.delete()
  }
}

class MySQL {
  def insert(): Unit = {
    println("insert")
  }
}

class DB {
  def delete(): Unit = {
    println("delete")
  }
}
