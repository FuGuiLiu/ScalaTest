package com.sky.scala.exercise15.map.dataProcess

object exercise02 {
  def main(args: Array[String]): Unit = {
    val list = List("alice", "andelu", "jaCK")
    val list2 = StringToUpperCase(list).stringToUpperCase2(stringToUpperCase)
    println(list2)
  }

  def stringToUpperCase(str: String): String = {
    str.toUpperCase()
  }


}

class StringToUpperCase(inStrList: List[String]) {
  val strList = inStrList
  var strList2 = List[String]()

  def stringToUpperCase2(f: String => String): List[String] = {
    for (item <- strList) {
      strList2 = strList2 :+ f(item)
    }
    strList2
  }
}

object StringToUpperCase {
  def apply(inStrList: List[String]): StringToUpperCase = new StringToUpperCase(inStrList)
}