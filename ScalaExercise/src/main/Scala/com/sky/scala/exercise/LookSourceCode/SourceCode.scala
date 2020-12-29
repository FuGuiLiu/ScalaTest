package com.sky.scala.exercise.LookSourceCode

object SourceCode {
  /**
   * @deprecated xxx
   * @example test encoding
   * @param args
   */
  def main(args: Array[String]): Unit = {
    var array = new Array[Int](10)
    for (item <- array) {
      print("Item=" + item.toString + "\n")
    }
  }

  /**
   * @deprecated 过期了
   * @example 输入 n1=10 n2 =20 return 30
   * @param n1
   * @param n2
   * @return 和
   */
  def sum(n1: Int, n2: Int): Int = {
    return n1 + n2
  }
}
