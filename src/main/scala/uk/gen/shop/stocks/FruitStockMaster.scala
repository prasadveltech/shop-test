package uk.gen.shop.stocks

import uk.gen.shop.products.{Empty, Orange, Apple,Product}

/**
  * Created by PJAYARAT on 11/08/2016.
  */
class FruitStockMaster extends StockMaster{

  private val items=List(Apple,Orange)
  override def getProduct(productName: String): Product = items.find(_.name.toLowerCase == productName.toLowerCase).getOrElse(Empty)
}
