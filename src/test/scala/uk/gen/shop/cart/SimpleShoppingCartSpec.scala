package uk.gen.shop.cart

import org.scalatest.{Matchers, GivenWhenThen, FeatureSpec}
import uk.gen.shop.products.{Orange, Apple}

/**
  * Created by PJAYARAT on 11/08/2016.
  */
class SimpleShoppingCartSpec extends FeatureSpec with GivenWhenThen with Matchers{
  feature("Simple shopping cart") {
    scenario("Test add product") {
      Given("a simple shopping cart")
      val simpleCart = new SimpleShoppingCart

      When("adding a apple")
      simpleCart.addProduct(Apple)

      Then("apple should be available in cart")
      simpleCart.countProducts should be(1)

    }

    scenario("Test adding more product") {
      Given("a simple shopping cart")
      val simpleCart = new SimpleShoppingCart

      When("adding 1 apple and 2 orange")
      simpleCart.addProduct(Apple)
      simpleCart.addProduct(Orange)
      simpleCart.addProduct(Orange)

      Then("apple should be available in cart")
      simpleCart.countProducts should be(3)

    }

    scenario("Test total cost") {
      Given("a simple shopping cart")
      val simpleCart = new SimpleShoppingCart

      When("adding 1 apple and 2 orange")
      simpleCart.addProduct(Apple)
      simpleCart.addProduct(Orange)
      simpleCart.addProduct(Orange)

      Then("apple should be available in cart")
      simpleCart.countProducts should be(3)
      simpleCart.calculateTotal should be(1.1)

    }
  }

}
