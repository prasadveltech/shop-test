package uk.gen.shop.till

import uk.gen.shop.cart.SimpleShoppingCart
import uk.gen.shop.stocks.FruitStockMaster

import scala.util.{Failure, Success, Try}

/**
  * Created by PJAYARAT on 11/08/2016.
  */
object Scanner {
  def main(args: Array[String]) = {

    Try(System.console()) match {
      case  Success(cons) => {
        println("Welcome to till scanner. Enter products to scan =>")
        val scannedProducts = cons.readLine()
        val fruitStockMaster = new FruitStockMaster
        val cliScanner= new CommandLineScannerParser(fruitStockMaster)
        val parsedProducts = cliScanner.parseScannedString(scannedProducts)
        val cart = new SimpleShoppingCart
        parsedProducts.foreach(cart.addProduct(_))
        println(s"scanned items are ${parsedProducts.map(_.name)} ")
        println(s"total simple cart value is ${cart.calculateTotal} ")
      }
      case Failure(e) => {
        println("Console Missing")
        System.exit(0)
      }
    }




  }

}
