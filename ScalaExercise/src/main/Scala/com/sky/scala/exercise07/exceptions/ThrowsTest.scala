package com.sky.scala.exercise07.exceptions

object ThrowsTest {
  def main(args: Array[String]): Unit = {
    numFormat()
  }

  @throws(classOf[NumberFormatException])
  def numFormat() {
    "abc".toInt
  }
}
