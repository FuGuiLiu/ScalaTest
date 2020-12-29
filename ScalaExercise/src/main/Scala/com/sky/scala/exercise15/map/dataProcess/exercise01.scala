package com.sky.scala.exercise15.map.dataProcess

object exercise01 {
  def main(args: Array[String]): Unit = {
    //    将 list(3,5,7) 集合中的内容都 * 2返回新的集合

    val list12 = List[Int](3, 5, 7)
    //    val value = list.map[Int](elementProduct)
    //    println("处理过后的集合" + value)
    val list = MyList()
    val value = list.map(elementProduct)

    println(value)
  }

  def elementProduct(num: Int): Int = {
    println("调用的次数")
    num * 2
  }
}

class MyList {
  val myList = List[Int](3, 5, 7, 100)
  var newMyList = List[Int]()

  def map(f: Int => Int): List[Int] = {
    for (item <- this.myList) {
      newMyList = newMyList :+ f(item)
    }
    newMyList
  }
}

object MyList {
  def apply(): MyList = new MyList()
}