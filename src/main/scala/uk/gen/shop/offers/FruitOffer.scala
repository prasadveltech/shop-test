package uk.gen.shop.offers

import uk.gen.shop.cart.ShoppingCart
import uk.gen.shop.products.{Orange, Apple}

/**
  * Created by PJAYARAT on 14/08/2016.
  */
trait FruitOffer extends Offers{
this: ShoppingCart =>

  override  def chargeableCartProducts = applesToBeCharged ++ orangesToBeCharged

  private def applesToBeCharged = cartProducts.filter(_.name == Apple.name).take(countApplesToBeCharged(cartProducts.count(_.name == Apple.name)))

  private def orangesToBeCharged = cartProducts.filter(_.name == Orange.name).take(countOrangesToBeCharged(cartProducts.count(_.name == Orange.name)))

  private def countApplesToBeCharged(appleCount: Int) = {
    appleCount match {
      case 0 => 0
      case 1 => 1
      case cnt => cnt - cnt/2
    }
  }


  private def countOrangesToBeCharged(orangeCount: Int) = {
    orangeCount match {
      case 0 => 0
      case 1 => 1
      case 2 => 2
      case cnt => cnt - cnt/3
    }

  }

}
