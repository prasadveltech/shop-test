package uk.gen.shop.offers

import uk.gen.shop.cart.ShoppingCart
import uk.gen.shop.products.Apple

/**
  * Created by PJAYARAT on 14/08/2016.
  */
trait FruitOffer extends Offers{
this: ShoppingCart =>

  override  def chargeableCartProducts = applesToBeCharged

  private def applesToBeCharged = cartProducts.take(countAppleToBeCharged(cartProducts.count(_.name == Apple.name)))

  private def countAppleToBeCharged(appleCount: Int) = {

    appleCount match {
      case 0 => 0
      case 1 => 1
      case cnt if cnt%2 == 0 => cnt - cnt/2
      case cnt if cnt%2 == 1 => cnt - cnt/2
    }

  }

}
