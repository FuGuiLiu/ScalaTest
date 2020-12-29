package com.sky.scala {

  package life {


    object test {
      def main(args: Array[String]): Unit = {
        import com.sky.scala.myScala.User
        var user = new User

        println(user)
        println(user.age)
      }
    }

  }

  package object myScala {
    var name: String = "刘富贵"

    def sayHello: Unit = {
      println("hello" + this.name)
    }
  }

  package myScala {

    class User {
      private[scala] var age: Int = 10
    }

    object DemoTest {
      def main(args: Array[String]): Unit = {
        //        使用包对象的属性和方法
        println("包对象的属性=" + name)
        //        使用包对象的方法
        sayHello
      }
    }


  }

}