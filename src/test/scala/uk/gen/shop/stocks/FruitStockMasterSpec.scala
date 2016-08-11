package uk.gen.shop.stocks

import org.scalatest.{Matchers, GivenWhenThen, FeatureSpec}

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

      Then("apple should be available")
      apple shouldBe "Apple"

    }

    scenario("Test whether Orange exist") {
      Given("a fruit stock master")
      val mstr=new FruitStockMaster

      When("check for Orange")
      val apple = mstr.getProduct("Orange")

      Then("Orange should be available")
      apple shouldBe "Orange"

    }
  }

}
