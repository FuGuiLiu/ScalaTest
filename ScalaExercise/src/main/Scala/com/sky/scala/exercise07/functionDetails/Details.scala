package com.sky.scala.exercise07.functionDetails

import scala.io.StdIn

object Details {
  def main(args: Array[String]): Unit = {
    def f(): Unit = {
      println("f1")
    }

    println("ok")

    def sayOk(): Unit = {
      println("mian ok")

      def sayOk(): Unit = {
        println("sayOk,sayOk")
      }
    }
  }

  def sayOk(): Unit = {
    println("mian ok")
  }
}
