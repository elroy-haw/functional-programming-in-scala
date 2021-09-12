package example

import org.scalatest.funsuite.AnyFunSuite

class PolymorphismSuite extends AnyFunSuite {
  test("Array(3, 2, 1) is not considered sorted") {
    assert(Polymorphism.isSorted(Array(3, 2, 1), (x: Int, y: Int) => x <= y) == false)
  }
  test("Array(1, 2, 2) is considered sorted") {
    assert(Polymorphism.isSorted(Array(1, 2, 2), (x: Int, y: Int) => x <= y) == true)
  }
  test("Array('c', 'b', 'b') is not considered sorted") {
    assert(Polymorphism.isSorted(Array('c', 'b', 'b'), (x: Char, y: Char) => x.compare(y) <= 0) == false)
  }
  test("Array('a', 'b', 'c') is considered sorted") {
    assert(Polymorphism.isSorted(Array('a', 'b', 'c'), (x: Char, y: Char) => x.compare(y) <= 0) == true)
  }
}