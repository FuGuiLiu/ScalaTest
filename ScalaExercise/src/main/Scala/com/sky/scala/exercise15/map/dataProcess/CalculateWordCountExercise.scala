package com.sky.scala.exercise15.map.dataProcess

object CalculateWordCountExercise {
  def main(args: Array[String]): Unit = {
    var list = List("atguigu han hello", "atguuigu han aaa aaa aaa ccc ddd uuu")
    println(listToContent(list))
  }

  //  首先将集合转换为一个整体的文本内容

  def listToContent(list: List[String]): List[String] = {
    var newWordList = List()
    var array = new Array[String](20)
    for (elem <- list.toArray) {
      println(elem)
    }
    println(array)
    newWordList
  }

}
