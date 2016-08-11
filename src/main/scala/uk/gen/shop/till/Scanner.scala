package uk.gen.shop.till

import uk.gen.shop.stocks.FruitStockMaster

import scala.util.{Failure, Success, Try}

/**
  * Created by PJAYARAT on 11/08/2016.
  */
object Scanner {
  def main(args: Array[String]) = {

    Try(System.console()) match {
      case  Success(cons) => {
        println("Welcome to till scanner")
        val scannedProducts = cons.readLine()
        val fruitStockMaster = new FruitStockMaster
        val cliScanner= new CommandLineScannerParser(fruitStockMaster)
        val parsedProducts = cliScanner.parseScannedString(scannedProducts)
        println(s"Scanned items are ${parsedProducts.map(_.name)} ")
      }
      case Failure(e) => {
        println("Console Missing")
        System.exit(0)
      }
    }




  }

}
