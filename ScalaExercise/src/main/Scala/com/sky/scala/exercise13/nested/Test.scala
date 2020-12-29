package com.sky.scala.exercise13.nested

object Test {
  def main(args: Array[String]): Unit = {

  }
}

class A {
  myA =>

  class B {
    println(myA.aName)
  }

  // 当给外部指定别名时,需要将外部类的属性放在别名后
  var aName = "dsa"

}

class C {
  var cName = "cas"

  class D {
    println(C.this.cName)
  }

}
