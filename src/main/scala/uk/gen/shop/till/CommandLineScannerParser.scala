package uk.gen.shop.till

import uk.gen.shop.products.{Empty, Product}
import uk.gen.shop.stocks.FruitStockMaster

/**
  * Created by PJAYARAT on 12/08/2016.
  */
class CommandLineScannerParser(fruitStockMaster: FruitStockMaster) {

  def parseScannedString(scannedCSV:String): List[Product] = {
    val productsWithEmpty = scannedCSV.split(",").foldLeft(List.empty[Product]){
      (products, eachProduct) => {
        fruitStockMaster.getProduct(eachProduct.trim) :: products

      }
    }
    productsWithEmpty.filter(_ != Empty)
  }

}
