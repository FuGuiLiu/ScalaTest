package com.sky.scala.exercise15.map.dataProcess

import scala.collection.mutable.ArrayBuffer

object FoldLeftExercise {
  def main(args: Array[String]): Unit = {
    val content = "AAAAAAAAAAAAAAAAABBBBBBBBBBBBBBBBBBCCCCCCCCCCCCCCCCCDDDDDDD"
    var arrayBuffer = new ArrayBuffer[Char]()
    val functionToTuple = content.foldLeft(arrayBuffer)(foldLefts)
    println(functionToTuple)
  }

  def foldLefts(abf: ArrayBuffer[Char], c: Char): ArrayBuffer[Char] = {
    abf.append(c)
  }
}
