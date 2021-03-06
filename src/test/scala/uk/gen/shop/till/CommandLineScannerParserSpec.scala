package uk.gen.shop.till

import org.scalatest.{Matchers, GivenWhenThen, FeatureSpec}
import uk.gen.shop.cart.SimpleShoppingCart
import uk.gen.shop.products.{Orange, Apple}
import uk.gen.shop.stocks.FruitStockMaster

/**
  * Created by PJAYARAT on 12/08/2016.
  */
class CommandLineScannerParserSpec extends FeatureSpec with GivenWhenThen with Matchers{

  feature("Till Scanner") {
    scenario("Scan items from command line") {
      Given("a till scanner that reads command line")
      val scannedItems="Apple,Orange,Apple"

      And("scanning items from command line")
      val fruitStockMaster = new FruitStockMaster
      val scanner = new CommandLineScannerParser(fruitStockMaster)

      Then("parse the scanned items")
      val itemsList = scanner.parseScannedString(scannedItems)
      itemsList.count(_ == Apple) should be(2)
      itemsList.count(_ == Orange) should be(1)
    }

    scenario("Scan items from command line and calculate total") {
      Given("a till scanner that reads command line")
      val scannedItems="Apple,Orange,Apple"

      And("scanning items from command line")
      val fruitStockMaster = new FruitStockMaster
      val scanner = new CommandLineScannerParser(fruitStockMaster)

      And("simple cart is provided")
      val cart=new SimpleShoppingCart

      Then("parse the scanned items")
      val itemsList = scanner.parseScannedString(scannedItems)
      itemsList.foreach(cart.addProduct(_))
      itemsList.count(_ == Apple) should be(2)
      itemsList.count(_ == Orange) should be(1)
      cart.calculateTotal should be(1.45)
    }
  }

}
