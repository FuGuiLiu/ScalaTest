package com.sky.scala.exercise17.recursionDemo

//求阶乘
object GetFactorial {
  def main(args: Array[String]): Unit = {
    println(getFactorial(19))
  }

  def getFactorial(n: BigInt): BigInt = {
    if (n == 0) 1 else n * getFactorial(n - 1)
  }
}
