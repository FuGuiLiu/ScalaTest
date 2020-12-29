package com.sky.scala.exercise15.par

import scala.collection.parallel.CollectionConverters._

object ParDemo {
  def main(args: Array[String]): Unit = {
    //    val l = System.currentTimeMillis()
    //    (0 to 999999).foreach(println)
    val distinct = (0 to 100).map { case _ => Thread.currentThread().getName }.distinct
    val distinct2 = (0 to 100).par.map { case _ => Thread.currentThread().getName }.distinct

    println(distinct)
    println(distinct2)
    //    val l2 = System.currentTimeMillis()
    //    println("执行完毕,总共用时:" + (l2 - l) + "ms毫秒")
  }
}
