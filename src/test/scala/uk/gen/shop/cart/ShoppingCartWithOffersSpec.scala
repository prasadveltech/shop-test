package uk.gen.shop.cart

import org.scalatest.{Matchers, GivenWhenThen, FeatureSpec}
import uk.gen.shop.offers.FruitOffer
import uk.gen.shop.products.Apple

/**
  * Created by PJAYARAT on 14/08/2016.
  */
class ShoppingCartWithOffersSpec extends FeatureSpec with GivenWhenThen with Matchers{
  feature("Offer shopping cart") {
    scenario("Test cart with offers") {
      Given("a shopping cart along with offers")
      val offerCart = new SimpleShoppingCart with FruitOffer

      When("adding 2 apples")
      offerCart.addProduct(Apple)
      offerCart.addProduct(Apple)

      Then("apples should be available in cart")
      offerCart.countProducts should be(2)
    }

    scenario("Test cart price with offers") {
      Given("a shopping cart along with offers")
      val offerCart = new SimpleShoppingCart with FruitOffer

      When("adding 2 apples")
      offerCart.addProduct(Apple)
      offerCart.addProduct(Apple)

      Then("one apple should be charged")
      offerCart.appleCountToCharge should be(1)
    }

  }

}
