package uk.gen.shop.stocks

import org.scalatest.{Matchers, GivenWhenThen, FeatureSpec}
import uk.gen.shop.products.{Empty, Orange, Apple}

/**
  * Created by PJAYARAT on 11/08/2016.
  */
class FruitStockMasterSpec extends FeatureSpec with GivenWhenThen with Matchers{

  feature("Fruit Stock Master") {
    scenario("Test whether Apple exist") {
      Given("a fruit stock master")
      val mstr=new FruitStockMaster

      When("check for apple")
      val apple = mstr.getProduct("Apple")

      Then("apple should be available and costs 0.6")
      apple shouldBe Apple
      apple.cost should be(BigDecimal(0.6))

    }

    scenario("Test whether Orange exist") {
      Given("a fruit stock master")
      val mstr=new FruitStockMaster

      When("check for Orange")
      val orange = mstr.getProduct("Orange")

      Then("Orange should be available and costs 0.25")
      orange shouldBe Orange
      orange.cost should be(BigDecimal(0.25))

    }

    scenario("Test non exist fruit") {
      Given("a fruit stock master")
      val mstr=new FruitStockMaster

      When("check for Strawberry")
      val empty = mstr.getProduct("Strawberry")

      Then("Strawberry should not be available and costs 0")
      empty shouldBe Empty
      empty.cost should be(BigDecimal(0))

    }

  }

}
