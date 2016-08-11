package uk.gen.shop.stocks


/**
  * Created by PJAYARAT on 11/08/2016.
  */
trait StockMaster {

  import uk.gen.shop.products.Product
  def getProduct(productName: String): Product


}
