package com.sky.scala.exercise13.homework

object ec01 {

}

class Conversion extends Convert {
  override def inchesToCentimeters(): Unit = ???

  override def gallonsToLiters(): Unit = ???

  override def milesToKilometers(): Unit = ???
}

trait Convert {
  def inchesToCentimeters()

  def gallonsToLiters()

  def milesToKilometers()

}