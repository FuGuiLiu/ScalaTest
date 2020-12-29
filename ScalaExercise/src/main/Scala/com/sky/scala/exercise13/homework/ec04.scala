package com.sky.scala.exercise13.homework


object PK extends Enumeration {
  type kp = Value
  val Spade = Value("♠")
  val Club = Value("♣")
  val Heart = Value("♥")
  val Diamond = Value("🛡")

  override def toString(): String = {
    PK.values.mkString(",").reverse
  }

  def checkIsRed(PK: kp) = PK == Heart

  def main(args: Array[String]): Unit = {
    println(PK.toString())
    println(PK.checkIsRed(PK.Heart))
  }
}