package com.sky.scala.exercise07.exceptions

object ExceptionCatch {
  def main(args: Array[String]): Unit = {
    //    test()
    try {
      test()
    } catch {
      case exception: RuntimeException => println("捕获到了异常" + exception.getMessage)
    } finally {

    }
    print("ok~~~")
  }

  def test() {
    throw new RuntimeException("test里面出现了异常")
  }
}
