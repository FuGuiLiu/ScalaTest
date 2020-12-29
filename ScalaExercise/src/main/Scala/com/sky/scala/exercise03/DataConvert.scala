package com.sky.scala.exercise03

object DataConvert {
  def main(args: Array[String]): Unit = {
    var num: Int = 10 * 3.5.toInt + 6 * 1.5.toInt
    var num2: Int = (10 * 3.5 + 6 * 1.5).toInt
    //    println(num)
    //    println(num2)

      //    基本类型转String类型
      var num3: Int = 10
      var str = num3 + ""
      println(str.isInstanceOf[String])
  }
}
