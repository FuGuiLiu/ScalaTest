package com.sky.scala.exercise11

import scala.io.StdIn

object Work03 {
  def main(args: Array[String]): Unit = {
    println("请输入员工的工资")
    var inSalary = StdIn.readDouble()
    println("请输入要发多少个月的工资")
    var inTotalMonth = StdIn.readInt()
    println("请输入奖金,有则填")
    var inBonus = StdIn.readDouble()
    val emp = new NormalEmp
    showEmpAnnal(emp, inSalary, inBonus, inTotalMonth)
  }

  def showEmpAnnal(employee: Employee, inSalary: Double, inBonus: Double, inTotalMonth: Int): Unit = {
    employee.getAnnual(inSalary, inBonus, inTotalMonth)
  }
}

class Employee {
  //  雇员姓名
  var name: String = ""
  //  月工资
  var salaryAMonth: Double = 0.0

  //  计算年工资
  def getAnnual(inSalaryAMonth: Double, inBonus: Double, inTotalMonth: Int): Unit = {

  }


}

class Manager extends Employee {
  //  经理的奖金属性
  var bonus: Double = _

  //  经理获取年工资
  override def getAnnual(inSalaryAMonth: Double, inBonus: Double, inTotalMonth: Int): Unit = {
    if (inTotalMonth == null || inTotalMonth == 0) {
      if (inBonus != null && inBonus != 0.0) {
        printf("该员工的工资为=%.2d" + (inTotalMonth * inSalaryAMonth + inBonus))
      }
    } else {
      if (inBonus == null || inBonus == 0.0) {
        printf("该员工的工资为=%.2d" + (12 * inSalaryAMonth + inBonus))
      }
    }
  }

  //    经理管理的方法
  def manage(): Unit = {
    println("经理管理..........")
  }
}

class NormalEmp extends Employee {

  override def getAnnual(inSalaryAMonth: Double, inBonus: Double, inTotalMonth: Int): Unit = {
    if (inTotalMonth == null || inTotalMonth == 0) {
      if (inBonus != null && inBonus != 0.0) {
        println("该员工的工资为:" + inTotalMonth * inSalaryAMonth + inBonus)
      }
    } else {
      if (inBonus == null || inBonus == 0.0) {
        println("该员工的工资为:" + 12 * inSalaryAMonth + inBonus)
      }
    }
  }

  def work(): Unit = {
    println("普通员工工作..........")
  }
}