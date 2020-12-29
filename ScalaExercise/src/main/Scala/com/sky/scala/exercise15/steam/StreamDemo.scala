package com.sky.scala.exercise15.steam

object StreamDemo {
  def main(args: Array[String]): Unit = {
    //    创建Stream
    def numsForm(n: BigInt): Stream[BigInt] = n #:: numsForm(n + 1)

    val stream = numsForm(5)

    //    println(stream)
    //
    //    println(stream.head)
    //    println(stream.tail)
    //
    //    println(stream.last)
    def calculationStream(n: BigInt): BigInt = {
      n * n
    }

    println(stream.map(calculationStream))
  }
}
