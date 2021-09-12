package example

import org.scalatest.funsuite.AnyFunSuite

class HigherOrderFunctionsSuite extends AnyFunSuite {
  test("Sum of 5 and 10 from currying should give 15") {
    assert(HigherOrderFunctions.curry((x: Int, y: Int) => x + y)(5)(10) == 15)
  }
  test("Sum of 5 and 10 from uncurrying should give 15") {
    assert(HigherOrderFunctions.uncurry((x: Int) => (y: Int) => x + y)(5, 10) == 15)
  }
  test("10 multiplied by 2, followed by adding 2 should give 22") {
    assert(HigherOrderFunctions.compose((x: Int) => x + 2, (y: Int) => y * 2)(10) == 22)
  }
}