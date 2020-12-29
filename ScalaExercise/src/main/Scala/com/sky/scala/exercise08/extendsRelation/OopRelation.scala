package com.sky.scala.exercise08.extendsRelation

object OopRelation {
  def main(args: Array[String]): Unit = {
    val employee = new Employee
    println(employee.hashCode())
    val employee2: Person = new Employee
    println(employee2.hashCode())
  }

  class Person {}

  class Employee extends Person {}

}
