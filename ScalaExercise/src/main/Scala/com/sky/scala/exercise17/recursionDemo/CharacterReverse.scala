package com.sky.scala.exercise17.recursionDemo

object CharacterReverse {
  def main(args: Array[String]): Unit = {
    println(characterReverse("HELLO"))
  }

  def characterReverse(s: String): String = {
    if (s.length == 1) s else characterReverse(s.tail) + s.head
  }
}
