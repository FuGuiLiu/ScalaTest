package com.sky.scala.exercise.method

object CollectionList {
  def main(args: Array[String]): Unit = {

    //  字符列表
    val site: List[String] = List("test", "test002", "test003")
    //  整形列表
    val nums: List[Int] = List(1, 3, 5, 7, 9)
    //  空列表
    val emptyList: List[Nothing] = List()

    //  二维列表
    val dim: List[List[Int]] = List(
      List(1, 0, 0),
      List(0, 1, 0),
      List(0, 0, 1)
    )
    if (!site.isEmpty) {
      println("不为空")
      println(site.head)
      println(site.tail)
    }
    //  使用 :::的方式连接集合
    val unionList = site ::: dim

    println(unionList)
    //  使用 list对象.:::连接对象
    val unionList02 = site.:::(dim);

    println(unionList02)

    //  使用concat方法连接两个集合
    val unionList03 = site.concat(dim)
    println(unionList03)

    //    使用fill方法进行集合列表填充,第一个参数是 填充的熟练,第二个是,循环的次数
    val newSite = List.fill(3)("hub")
    println(newSite)
    //    使用fill方法对素组集合进行填充

    val newNums = List.fill(10)(2)

    println(newNums)



    /*//    字符串列表
    val site02 = "A" :: ("B" :: ("C" :: "D" :: Nil))
    //    整形列表
    val nums02 = 1 :: (2 :: (3 :: (4 :: Nil)))
    //    空列表
    val empty02 = Nil
    //    二维列表
    val dim02 =
      (1 :: (0 :: (1 :: Nil))) ::
        (0 :: (1 :: (0 :: (Nil)))) ::
        (0 :: (0 :: (1 :: (Nil)))) ::
        Nil*/
  }

}
