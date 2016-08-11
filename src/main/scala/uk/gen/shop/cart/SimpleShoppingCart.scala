package uk.gen.shop.cart

import uk.gen.shop.products.Product

/**
  * Created by PJAYARAT on 11/08/2016.
  */
class SimpleShoppingCart extends ShoppingCart{
  override def addProduct(product: Product) = {
    throw new NoSuchMethodException
  }

  override def countProducts: Int = {
    throw new NoSuchMethodException
  }
}
