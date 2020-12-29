package com.sky.scala.exercise07.functionDetails

object Details03 {
  def main(args: Array[String]): Unit = {
    //    mysqlConn()
    //    如果我么希望修改某个默认值,则使用带名参数即可,比如修改用户名
    mysqlConn(user = "fugui")

  }

  def mysqlConn(ip: String = "localhost", port: String = "8888", user: String = "root", password: Int = 123) {
    println(ip)
    println(port)
    println(user)
    println(password)
  }
}

