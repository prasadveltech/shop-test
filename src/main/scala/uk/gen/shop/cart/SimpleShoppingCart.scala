package uk.gen.shop.cart

import uk.gen.shop.products.Product

import scala.collection.mutable

/**
  * Created by PJAYARAT on 11/08/2016.
  */
class SimpleShoppingCart extends ShoppingCart{
  private val cartItems= mutable.MutableList.empty[Product]
  override def addProduct(product: Product) =  cartItems += product

  override def countProducts: Int = cartItems.size

  override def calculateTotal: BigDecimal = chargeableCartProducts.foldLeft(BigDecimal(0)){
    (total,product) => {
      product.cost + total
    }
  }

  override def cartProducts: List[Product] = cartItems.toList

  override def chargeableCartProducts: List[Product] = cartItems.toList
}
