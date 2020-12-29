package com.sky.scala.exercise15.queue

import scala.collection.mutable

object QueueDemo {
  def main(args: Array[String]): Unit = {
    //    初始化
    val myqueue = new mutable.Queue[Int]
    println(myqueue)

    //向队列中追加单个元素和list
    //我们可以使用 += 或者 ++=集合对象  +=可以添加单个的元素,++=可以把一个集合中的元素添加进来
    //+= 一个集合对象 不是把集合中的内容放入队列中,而是直接把这个对象放入其中,但是我们可以通过将queue的泛型类型定义为Any来使用+=将一个对象加入到队列中,此时该对象将作为一个元素添加到队列中
    myqueue += 1
    myqueue ++= mutable.ListBuffer[Int](1, 23, 4)
    println(myqueue)
    println("------------------------")
    // 队列的增删 使用 dequeue()方法
    println("删除的元素为:" + myqueue.dequeue() + "删除后的队列" + myqueue)
    println("------------------------")
    //    队列的新增
    println("新增前队列的元素" + myqueue + "新增后队列的元素" + myqueue.enqueue(99, 100, 99, 101))
    println("=======================")
    //    返回队列的第一个元素
    println("队列的第一个元素为=" + myqueue.head)

    //    返回队列的最后一个元素
    println("队列的最后一个元素为=" + myqueue.last)
    //    返回队列的尾部(即:返回除了第一个以外剩余的元素,可以级联使用,这个在递归时使用较多)
    //    返回队列的尾部
    println(myqueue.tail)
    //    返回队列的尾部,递归再次调用
    println(myqueue.tail.tail)
  }
}
