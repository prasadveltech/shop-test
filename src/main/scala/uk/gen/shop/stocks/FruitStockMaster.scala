package uk.gen.shop.stocks

/**
  * Created by PJAYARAT on 11/08/2016.
  */
class FruitStockMaster extends StockMaster{
  override def getProduct(productName: String): String = {
    throw new NoSuchMethodException
  }
}
