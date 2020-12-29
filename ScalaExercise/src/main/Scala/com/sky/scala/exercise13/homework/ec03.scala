package com.sky.scala.exercise13.homework

object ec03 extends App {
  var args1 = args.reverse.mkString(" ")

  for (i <- args1) {
    print(i)
  }
}
