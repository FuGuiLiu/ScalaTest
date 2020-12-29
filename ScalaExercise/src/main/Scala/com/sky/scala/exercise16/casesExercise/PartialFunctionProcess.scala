package com.sky.scala.exercise16.casesExercise

object PartialFunctionProcess {
  def main(args: Array[String]): Unit = {
    val list = List(1, 23, 4, 5, "ad")
    //    当我们使用偏函数的时候,就不能使用list.map了,应该使用collect函数
    println(list.collect(partial))
  }

  //  定义了一个偏函数
  //  partialFunction[Any,Int]表示偏函数接受的类型为Any类型,返回的类型为Int类型
  //  isInstanceOf(x:Any)如果返回为True则会调用Apply方法,如果为False,则过滤掉
  //  apply 构造器对传入的值可以进行自定义改造
  val partial = new PartialFunction[Any, Int] {
    override def isDefinedAt(x: Any): Boolean = x.isInstanceOf[Int]

    override def apply(v1: Any): Int = {
      v1.asInstanceOf[Int] + 1
    }
  }

  //  偏函数简化形式
  def f2: PartialFunction[Any, Int] = {
    case i: Int => i + 1
  }

  val list2 = List(1, 3, 4, 5, "ads").collect(f2)
  println(list2)

  //  偏函数简化形式二

  val list3 = List(1, 23, 43, 5, "asdf").collect {
    case i: Int => i + 1
  }

  println(list3)
}
