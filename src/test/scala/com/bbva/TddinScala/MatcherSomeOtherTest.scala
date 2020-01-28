package com.bbva.TddinScala

import com.datio.spark.test.ContextProvider
import org.apache.spark.sql.Row
import org.scalatest.{FunSuite, Matchers}

class MatcherSomeOtherTest extends FunSuite with Matchers with ContextProvider {
  test("This succeeds if the assertion holds true for every element") {
    val df = spark.createDataFrame(Seq((1L, "a"), (2L, "a"), (3L, "a"))).toDF("id", "noChange")
    all(df.select("noChange").collect()) should be(Row("a"))
  }
}
