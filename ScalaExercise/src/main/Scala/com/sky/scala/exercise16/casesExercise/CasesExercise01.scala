package com.sky.scala.exercise16.casesExercise

object CasesExercise01 {
  def main(args: Array[String]): Unit = {
    val sale = new Bundle("书籍", 10, Book("漫画", 40), Bundle("文学作品", 20, Book("围城", 80), Book("阳关", 30)))

    val result = sale match {
      case Bundle(_, _, book@Book(description, price), bundle@_*) => (book, bundle)
    }
    //    val tuple = result.->(new Book("三国", 190))
    //    println(tuple._1._2)
    println(prices(sale))

    def prices(item: Item): Double = {
      item match {
        case Book(_, price) => price
        case Bundle(_, discount, books@_*) => books.map(prices).sum - discount
      }
    }
  }

  //  设计样例类
  abstract class Item

  case class Book(description: String, price: Double) extends Item

  case class Bundle(description: String, discount: Double, Item: Item*) extends Item

}
