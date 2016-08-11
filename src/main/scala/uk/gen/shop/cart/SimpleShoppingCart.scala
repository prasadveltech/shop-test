package uk.gen.shop.cart

import uk.gen.shop.products.Product

/**
  * Created by PJAYARAT on 11/08/2016.
  */
class SimpleShoppingCart extends ShoppingCart{
  private var cartItems=List.empty[Product]
  override def addProduct(product: Product) = cartItems =  product :: cartItems

  override def countProducts: Int = cartItems.size

  override def calculateTotal: BigDecimal = {
    throw new NoSuchMethodException
  }
}
