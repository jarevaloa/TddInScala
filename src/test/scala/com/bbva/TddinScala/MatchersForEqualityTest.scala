package com.bbva.TddinScala
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{FunSuite, Matchers}

@RunWith(classOf[JUnitRunner])
class MatchersForEqualityTest extends FunSuite with Matchers {
  test("Matchers for equality") {
    val message: String = "Hello World"
    message should be("Hello World")
    message shouldBe "Hello World"
    message should equal("Hello World")
    message should ===("Hello World")
    message shouldEqual "Hello World"
  }

}
