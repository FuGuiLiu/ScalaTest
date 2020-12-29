package com.sky.scala.exercise04

import scala.io.StdIn

object ClassTest02 {
  def main(args: Array[String]): Unit = {
    //    班级数量
    val classNum = 3
    //    班级人数
    val stuNum = 5
    //    学生分数
    var score = 0.0
    //    班级总分
    var classesScore = 0.0
    //    所有班级总分
    var totalScore = 0.0
    //    及格人数
    var passPeople = 0
    for (i <- 1 to classNum) {
      classesScore = 0.0
      for (j <- 1 to stuNum) {
        printf("请输入第%d个班级的第%d个学生的分数\n", i, j)
        score = StdIn.readDouble()
        if (score.toInt >= 60) {
          passPeople += 1
        }
        classesScore += score
      }
      totalScore += classesScore
      printf("第%d个班级的平均分为%.2f\n", i, classesScore / stuNum)
    }
    printf("所有班级的平均分为%.2f", totalScore / (stuNum * classNum))
    printf("及格的人数为%o", passPeople)
  }
}
