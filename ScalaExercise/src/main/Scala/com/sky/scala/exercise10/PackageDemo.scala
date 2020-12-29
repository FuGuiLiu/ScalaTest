package com.sky.scala {
  package test {

    class Person {
      var name: String = _

      def sayName(): Unit = {
        println("hello，mynameis" + this.name)
      }
    }

    object Test {
      def main(args: Array[String]): Unit = {
        println("ok")
      }
    }

  }

}