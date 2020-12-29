package com.sky.scala.exercise17

//计算递归和普通循环一个数值的时间
object CalculationRecursionTime {
  def main(args: Array[String]): Unit = {
    val currentMills = System.currentTimeMillis()
    //    使用循环进行对值的增加
    var n1: BigInt = 1
    var sum: BigInt = 0
    while (n1 <= 99999999L) {
      n1 += 1
      sum += n1
    }
    println(sum)
    val currentMills2 = System.currentTimeMillis()

    println("循环总用时" + (currentMills2 - currentMills) + "毫秒")

    //    使用递归进行对值的增加
    /* val currentMills = System.currentTimeMillis()
     recursionNum(1, 0)
     val currentMills2 = System.currentTimeMillis()

     println("递归总用时" + (currentMills2 - currentMills)+"毫秒")*/
  }

  def recursionNum(n1: BigInt, sum: BigInt): BigInt = {
    if (n1 <= 99999999L) return recursionNum(n1 + 1, sum + n1)
    else return sum
  }


}
