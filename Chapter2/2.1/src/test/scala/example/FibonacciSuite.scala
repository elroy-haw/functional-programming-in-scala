package example

import org.scalatest.funsuite.AnyFunSuite

class FibonacciSuite extends AnyFunSuite {
  test("The 0th Fibonacci number should be 0") {
    assert(Fibonacci.fib(0) == 0)
  }
  test("The 1st Fibonacci number should be 1") {
    assert(Fibonacci.fib(1) == 1)
  }
  test("The 10th Fibonacci number should be 55") {
    assert(Fibonacci.fib(10) == 55)
  }
}
