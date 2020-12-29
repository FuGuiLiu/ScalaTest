package com.sky.scala.exercise11.work

object exercise04 {
  def main(args: Array[String]): Unit = {
    //    type myInt = Int
    //    val num: myInt = 9090
    //    println(num)
    println(Suits.isRed(Suits.Heart))
    println(Suits.isRed(Suits.Spade))
    println(Suits.toString())
  }
}

object Suits extends Enumeration {
  type Suits = Value
  val Spade = Value("♠")
  val Club = Value("♣")
  val Heart = Value("♥")
  val Diamond = Value("🛡")

  override def toString(): String = {
    Suits.values.mkString(",").reverse
  }

  def isRed(suits: Suits) = suits == Heart || suits == Diamond
}
