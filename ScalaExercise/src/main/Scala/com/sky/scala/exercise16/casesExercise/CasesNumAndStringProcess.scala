package com.sky.scala.exercise16.casesExercise

object CasesNumAndStringProcess {
  def main(args: Array[String]): Unit = {
    val list = List(1, 23, 4, 5, "ad")
    println(list.map(numProcess))
  }

  def numProcess(num: Any): Any = {
    num match {
      case n: Int => n + 1
      case _ => "字符不处理"
    }
  }
}
