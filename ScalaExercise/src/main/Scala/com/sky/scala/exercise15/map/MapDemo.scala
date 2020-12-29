package com.sky.scala.exercise15.map

import scala.collection.mutable

object MapDemo {
  def main(args: Array[String]): Unit = {
    // 1. 默认的map是 immutable.Map不可变的
    // 2. key  value 支持any类型
    // 3. map 底层 每对 key value是tuple元组类型
    // 4. 从输出的结果来看,不可变的map输出和声名顺序一致
    val map = Map("alice" -> 10, "Bob" -> 12, "kotlin" -> 21)
    println(map)
    //    构建不可变的Map
    // 4. 从输出的结果来看,可变的map输出和声名顺序不一致
    val map02 = mutable.Map("alice" -> 10, "Bob" -> 12, "kotlin" -> 21)
    println(map02)

    //    创建空的Map映射
    val nullMap = mutable.Map()
    println(nullMap)
    //    声明对偶元组
    val tuple = mutable.Map(("alice", 10), ("Bob", 23), ("kotlin", 19))
    println(tuple)

    //    map的取值
    //    如果key存在,则返回对应的值
    //    如果key不存在,则抛出异常 [java.util.NoSuchElementException]
    //    在Java中如果key不存在则返回null
    val i = tuple("alice")
    println(i)
    //方法二
    println("方法二============")
    if (tuple.contains("alice")) {
      println(tuple("alice"))
    } else {
      println("key不存在")
    }
    println("------------------------")
    if (tuple.contains("alice~~")) {
      println(tuple.contains("alice"))
    } else {
      println("key不存在")
    }
    //方法三
    println("方法三========================")
    println(tuple.get("alice"))
    if (tuple.get("alice") != null) {
      println(tuple.get("alice").get)
    }
    println("--------------------")
    if (tuple.get("alice~") != None) {
      println(tuple.get("alice").get)
    } else {
      println("key不存在")
    }
    // 方法四
    println("方法四========================")
    println(tuple.getOrElse("alice", "默认值 <。)#)))≦   🐟"))
    println(tuple.getOrElse("alice~", "默认值 <。)#)))≦   🐟"))



    //    更新map的值
    println("更新map的值============")
    tuple("alice") = 123
    println(tuple.get("alice").get)

    //        使用(+=) 增加单个值
    println("使用(+=)============")
    tuple += ("富贵" -> 123)
    println(tuple("富贵"))


    //    增加多个元素
    //    方式一:通过声明一个新的 map集合来拼接另一个map集合
    val tuple2 = tuple + ("张三" -> 12, "李四" -> 10)
    //    方式二:通过+= 来添加多个
    tuple += (("王五" -> 12), ("赵六" -> 57))
    println(tuple)

    // 删除key
    println("删除key============")
    tuple -= ("富贵", "李四")
    println(tuple)

    //    map的遍历
    //    方式一
    println("方式一===============")
    for ((k, v) <- tuple) {
      println("key的值为:" + k)
      println("value的值为:" + v)
    }
    //    方式二
    println("方式二===============")
    for (k <- tuple.keys) {
      println("key的值为:" + k)
      println("value的值为" + tuple(k))
    }
    //    方式三
    println("方式一===============")
    for (v <- tuple.values) {
      println("value的值为" + v)
    }
    //    方式四
    println("方式四===============")
    for (t <- tuple) {
      println("key的值为:" + t._1)
      println("value的值为:" + t._2)
    }
    println("方式五===============")
    //    通过keySet来取值
    val tupleSet = tuple.keySet
    for (keys <- tupleSet) {
      println("value的值为:" + tuple(keys))
    }
    println("方式六===============")
    val tupleSet2 = tuple.keySet
    val iterator = tupleSet2.iterator

    while (iterator.hasNext) {
      println("value的值为" + tuple(iterator.next()))
    }
  }
}
