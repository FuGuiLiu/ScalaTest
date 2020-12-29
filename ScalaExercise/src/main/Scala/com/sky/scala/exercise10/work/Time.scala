package com.sky.scala.exercise10.work

import java.util.function.BiConsumer

object MapTest {
  def main(args: Array[String]): Unit = {
    import java.util.{HashMap => javaHashMap}
    import scala.collection.mutable.{HashMap => scalaHashMap}

    var javaMap = new javaHashMap[Int, String]()
    var scalaMap = new scalaHashMap[Int, String]()
    javaMap.put(1, "one")
    javaMap.put(2, "two")
    javaMap.put(3, "three")
    javaMap.put(4, "four")
    //    val ints = javaMap.keySet()
    //    val value = ints.iterator()
    //
    //    while (value.hasNext) {
    //      val i = value.next()
    //      scalaMap.put(i, javaMap.get(i))
    //    }
    for (i <- javaMap.keySet().toArray()) {
      scalaMap += (i.asInstanceOf[Int] -> javaMap.get(i))
    }
    println(scalaMap.mkString(" "))
  }

}
