package com.sky.scala.exercise12


object MW extends App {
  val cat = new Cat
  cat.drinkaa("🐱")
}

trait Drinker {
  var name: String

  def drinkaa(s: String): Unit = {

  }

  def drinker(): Unit = {
    println("drinker.......中")
  }
}

class Cat extends Drinker with Serializable {

  private val serialVersionUID = 4447240950527578321L

  override def drinkaa(s: String): Unit = {
    println(this.name + "喝水")
  }

  override var name: String = _
}
