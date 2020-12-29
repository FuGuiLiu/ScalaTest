package com.sky.scala.exercise17

object HigherOrderFunction2 {
  def main(args: Array[String]): Unit = {

    def minus(n: Int) = {
      (y: Int) => n - y
    }

    //    函数作为返回值执行方式一
    val f1 = minus(10)
    println(f1(20))
    //    函数作为防护之执行方式二
    //    函数柯里化
    println(minus(10)(30))

  }
}
