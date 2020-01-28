package com.bbva.TddinScala

import org.scalatest.{FunSuite, Matchers}
import com.datio.spark.test.ContextProvider
import org.apache.spark.sql.Row

class MatchersForInstanceTest extends FunSuite with Matchers with ContextProvider {
  test("this is a test for instance when process type is M ") {
    val processType = "M"
    val process     = ProcessFactory(processType)
    process shouldBe a[MonthlyProcess]
  }
}

trait Process {
  def run: Unit {}
}
class MonthlyProcess extends Process {
  override def run: Unit = {
    println("some actions monthly")
  }
}
class DailyProcess extends Process {
  override def run: Unit = {
    println("some actions Daily")
  }
}

object ProcessFactory {
  def apply(processType: String): Process = processType match {
    case "M" => new MonthlyProcess
    case "D" => new DailyProcess
    case _   => throw new IllegalArgumentException("Tipo no  valido")
  }
}
