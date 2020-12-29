package com.sky.scala.exercise02

object TypeDemo02 {
  def main(args: Array[String]): Unit = {
    //    当我们输出一个char类型,它会输出该数字对应的字符(码值表)
    var c: Char = 97
    println(c)

    //    Char 可以当作数字进行运算
    var c2: Char = 'a'
    var num = 10 + c2
    println(num)

    /**
     * Char类型转换错误原因分析
     * 当把一个计算的结果赋值给一个变量,则编译器会进行类型转换即判断(即会看范围+类型)
     * 当把一个字面量赋值一个变量,则编译器会进行类型转换及判断(即会看范围+类型)
     */

//    var c3: Char = 97 + 'a'
    //    var c4: Char = 97 + 1
    //    var c5: Char = 97
  }
}
