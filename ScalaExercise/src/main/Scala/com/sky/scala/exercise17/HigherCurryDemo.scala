package com.sky.scala.exercise17

object HigherCurryDemo {
  def main(args: Array[String]): Unit = {
    def eq(s: String, ss: String): Boolean = {
      s.equals(ss)
    }

    val str = "hello"

    println(str.checkEq("HELLO")(eq))

    println(str.checkEq("Hello!!")(_.equals(_)))
  }

  implicit class testEq(s: String) {
    def checkEq(ss: String)(f: (String, String) => Boolean) = {
      f(s.toUpperCase(), ss.toUpperCase())
    }
  }

}
