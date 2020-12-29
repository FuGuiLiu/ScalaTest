package com.sky.scala.exercise15.list

object ListDemo {
  def main(args: Array[String]): Unit = {
    //    说明:在默认情况下 list是在Scala.collection.immutable.list,即不可变
    //    在Scala中,List就是不可变的,如需要使用可变的list,则需要使用listBuffer
    //
    //    创建时直接赋值
    val list01 = List(1, 2, 3)
    //    打印集合
    //    println(list01)
    //  声明一个空的集合
    val list02 = Nil
    //    println(list02)


    var list03 = List("a", "b", "c")
    //    创建一个新的 集合,而我们原本的集合不会改变
    //    向前面追加
    val list03_new = list03 :+ "d"
    //    println(list03_new)
    //    println("===============")
    var list04 = List(1, 2, 3)
    //    向后面追加
    val list04_new = 0 +: list04
    //    println(list04_new)

    println("========================---------")

    val list05 = 1 :: 2 :: 3 :: list03 :: Nil
    println(list05)
    val list06 = "a" :: "b" :: "c" :: list04 ::: Nil
    println("======--------=========")
    println(list06)
  }
}
