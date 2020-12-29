package com.sky.scala.exercise.typeCheck

object TypeCheck {
  def main(args: Array[String]): Unit = {
    //    int变量的声明,可以直接声明并赋值,Scala中默认对数据进行判断,编译器自动推导,即类型自动推导
    //    int变量的声明,可以声明指定它的参数并赋值
    val num = 10 //方法一
    val num2: Int = 10 //方法二
    //    使用 isInstance判断是否符合某个类型
    val bool = num.isInstanceOf[Int]
    println(bool)

    //    使用var和val的区别
    //    var修饰的值可以修改
    var age = 10
    age = 100
    //    val修饰的值不可以修改
    val dc = 100
    //    dc = 11

    var dog = new Dog()
    //    dog.age = 10
    dog.name = "小白"
  }

  class Dog {
    val age: Int = 0
    var name: String = "小花"
  }

}
