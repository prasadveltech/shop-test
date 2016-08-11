package uk.gen.shop.stocks

/**
  * Created by PJAYARAT on 11/08/2016.
  */
class FruitStockMaster extends StockMaster{

  private val items=List("Apple")
  override def getProduct(productName: String): String = items.find(_ == productName).getOrElse("")
}
