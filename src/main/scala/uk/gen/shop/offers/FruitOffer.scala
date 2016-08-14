package uk.gen.shop.offers

import uk.gen.shop.cart.ShoppingCart

/**
  * Created by PJAYARAT on 14/08/2016.
  */
trait FruitOffer extends Offers{
this: ShoppingCart =>

  def appleCountToCharge: Int = {
    throw new NoSuchMethodException
  }

}
