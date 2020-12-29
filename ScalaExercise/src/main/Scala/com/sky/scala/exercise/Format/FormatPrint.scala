package com.sky.scala.exercise.Format

object FormatPrint {
  def main(args: Array[String]): Unit = {
    val str1: String = "hello"
    val str2: String = " world!"

    //    print(str1 + str2)

    val name: String = "富贵"
    val age: Int = 23
    val salary: Float = 9000F
    val height: Double = 185.16
    //    printf("姓名是=%s 年龄是=%d 薪水是=%.2f 身高是=%.2f", name, age, salary, height);

    print(s"个人信息:\n名字是:$name,\n年龄是:${age + 100},\n薪水是:${salary * 5},\n身高是:${height}")
  }
}
