package uk.gen.shop.cart

/**
  * Created by PJAYARAT on 11/08/2016.
  */
trait ShoppingCart {

  import uk.gen.shop.products.Product
  def addProduct(product:Product)

  def countProducts:Int

  def calculateTotal:BigDecimal

  def cartProducts: List[Product]

  def chargeableCartProducts: List[Product]

}
