name := "shop-test"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= {
  Seq(
    "org.scalatest" %% "scalatest" % "2.2.6" % Test
  )
}

mainClass := some("uk.gen.shop.till.Scanner")