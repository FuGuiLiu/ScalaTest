package com.sky.scala.exercise17

object CurryAbstractControl {
  def main(args: Array[String]): Unit = {
    //    方法调用方式一
    run {
      () => {
        println("开始执行任务")
        Thread.sleep(5000)
        println("任务执行完毕")
      }
    }
    //    方法调用方式二

    //    对于没有输入,没有返回值,可以简写为如下形式,去掉run2方法中的()参数
    run2 {
      println("开始执行任务")
      Thread.sleep(5000)
      println("任务执行完毕")
    }

  }

  def run(f: () => Unit): Unit = {
    new Thread() {
      override def run(): Unit = {
        f()
      }
    }.start()
  }

  def run2(f: => Unit): Unit = {
    new Thread() {
      override def run(): Unit = {
        f
      }
    }.start()
  }
}
