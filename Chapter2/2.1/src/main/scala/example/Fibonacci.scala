package example

object Fibonacci {
  def fib(n: Int): Int = {
    @annotation.tailrec
    def go(n: Int, prev: Int, curr: Int): Int = {
      if (n <= 0)
        curr
      else
        go(n - 1, prev + curr, prev)
    }
    go(n, 1, 0)
  }
}

/*
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55

go(10, 1, 0)
go(9, 1, 1) 
go(8, 2, 1)
go(7, 3, 2)
go(6, 5, 3)
go(5, 8, 5)
go(4, 13, 8)
go(3, 21, 13)
go(2, 34, 21)
go(1, 55, 34)
go(0, 89, 55) = 55
*/