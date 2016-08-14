package uk.gen.shop.cart

import org.scalatest.{Matchers, GivenWhenThen, FeatureSpec}
import uk.gen.shop.offers.FruitOffer
import uk.gen.shop.products.{Empty, Apple}

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

    scenario("Test cart of 0 apple price with offers") {
      Given("a shopping cart along with offers")
      val offerCart = new SimpleShoppingCart with FruitOffer

      When("adding 0 apple")
      offerCart.addProduct(Empty)

      Then("zero apple should be charged")
      offerCart.chargeableCartProducts.size should be(0)
      offerCart.calculateTotal should be(0)
    }

    scenario("Test cart of 1 apple price with offers") {
      Given("a shopping cart along with offers")
      val offerCart = new SimpleShoppingCart with FruitOffer

      When("adding 1 apple")
      offerCart.addProduct(Apple)

      Then("one apple should be charged")
      offerCart.chargeableCartProducts.size should be(1)
      offerCart.calculateTotal should be(0.6)
    }


    scenario("Test cart of 2 apples price with offers") {
      Given("a shopping cart along with offers")
      val offerCart = new SimpleShoppingCart with FruitOffer

      When("adding 2 apples")
      offerCart.addProduct(Apple)
      offerCart.addProduct(Apple)

      Then("one apple should be charged")
      offerCart.chargeableCartProducts.size should be(1)
      offerCart.calculateTotal should be(0.6)
    }


    scenario("Test cart of 3 apples price with offers") {
      Given("a shopping cart along with offers")
      val offerCart = new SimpleShoppingCart with FruitOffer

      When("adding 3 apples")
      offerCart.addProduct(Apple)
      offerCart.addProduct(Apple)
      offerCart.addProduct(Apple)

      Then("two apples should be charged")
      offerCart.chargeableCartProducts.size should be(2)
      offerCart.calculateTotal should be(1.2)
    }
  }

}
