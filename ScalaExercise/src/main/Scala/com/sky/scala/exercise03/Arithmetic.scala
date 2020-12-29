package com.sky.scala.exercise03

object Arithmetic {
  def main(args: Array[String]): Unit = {

    //  / 的使用
    var num = 10
    println("值为:" + num / 3)

    var num2: Double = 10 / 3
    println("值为:" + num2)

    var num3: Double = 10.0 / 3
    println("值为:" + num3)

    println("对值三进行格式化:" + num3.formatted("%.3f"))

    //    % 的使用
    //    %号的运算原则 a - a / b * b
    println(10 % 3)
    println(-10 % 3) // -10 - -10/3 * 3=-10 -9 = -1
    println(-10 % -3) // -10 - -10/-3 * 3=-10 -9 = -1

    //    ++
    //    ++ 和 -- 再Scala中没有++和--,而使用了 +=1 和 -=1
    var num4: Int = 10
    num4 += 1
    println("值:" + num4)


    //    --
    //    ++ 和 -- 再Scala中没有++和--,而使用了 +=1 和 -=1
    var num5: Int = 10
    num5 -= 1
    println("值:" + num5)
  }
}
