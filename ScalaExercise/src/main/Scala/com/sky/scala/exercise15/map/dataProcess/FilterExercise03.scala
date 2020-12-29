package com.sky.scala.exercise15.map.dataProcess

//数据过滤
object FilterExercise03 {
  def main(args: Array[String]): Unit = {
    val list = List("Alice", "andelu", "AjaCK")
    //    val list2 = strFilter(list).strFilter2(s)
    //    println(list2)
    val value = list.filter(isAStart)
    println(value)
  }

  def isAStart(str: String): Boolean = {
    str.startsWith("A")
  }

  def s(str: String): String = {
    str
  }

}

class strFilter(inStrList: List[String]) {
  val strList = inStrList
  var strList2 = List[String]()

  def strFilter2(f: String => String): List[String] = {
    for (item <- strList) {
      if (item.indexOf("A") == 0) {
        strList2 = strList2 :+ f(item)
      }
    }
    strList2
  }
}

object strFilter {
  def apply(inStrList: List[String]): strFilter = new strFilter(inStrList)
}
