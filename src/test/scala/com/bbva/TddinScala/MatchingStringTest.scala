package com.bbva.TddinScala
import com.datio.spark.test.ContextProvider
import org.scalatest.{FunSuite, Matchers}

class MatchingStringTest extends FunSuite with Matchers  {
  val message: String = "Hello World"
  test("Matching strings") {

    message should startWith("Hello")
    message should endWith("rld")
    message should not include ("Bluetab")
    message should endWith("wor.d")
    message should fullyMatch regex ("[A-Za-zs]+")
    "123zyx321" should startWith regex ("([d]+)" withGroups ("123"))

  }


}
