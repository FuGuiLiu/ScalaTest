package com.sky.scala.exercise15.map.dataProcess

import scala.collection.mutable

object calculateCharCount {
  def main(args: Array[String]): Unit = {
    val content = "AAAAAAAAAAAAAAAAABBBBBBBBBBBBBBBBBBCCCCCCCCCCCCCCCCCDDDDDDD"
    val value = content.foldLeft(Map[Char, Int]())(calculating)
    println(value)
    val value2 = content.foldLeft(mutable.Map[Char, Int]())(calculating2)
    println(value2)
  }

  def calculating(map: Map[Char, Int], c: Char): Map[Char, Int] = {
    //    使用的不可变map,每次返回的都是不同的map,浪费资源
    map + (c -> (map.getOrElse(c, 0) + 1))
  }

  def calculating2(map: mutable.Map[Char, Int], c: Char): mutable.Map[Char, Int] = {
    map += (c -> (map.getOrElse(c, 0) + 1))
  }
}
