package pl.mlynik

import org.scalatest.{Matchers, FunSuite}
import org.scalatest.prop.{TableDrivenPropertyChecks, PropertyChecks}

class SuperDigitTest extends FunSuite with TableDrivenPropertyChecks with Matchers {
  val inputOutput = Table(
    ("number", "superDigit"),
    (java.lang.Long.MAX_VALUE, 7),
    (java.lang.Integer.MAX_VALUE.toLong, 1),
    (98741L, 2),
    (1234L, 1),
    (444L, 3),
    (29L, 2)
  )

  test("Inputs and super digit outputs") {
    forAll(inputOutput) { (number: Long, exceptedSuperDigit: Int) =>
      SuperDigit(number) should equal(exceptedSuperDigit)
    }
  }
}
