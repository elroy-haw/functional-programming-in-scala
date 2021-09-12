# Tail recursive function to get the *n*th Fibonacci number

A call in Scala is said to be in *tail position* if the caller does nothing other than return the value of the recursive call.

If all recursive calls made by a function are in tail position, Scala automatically compiles the recursion to iterative loops that don't consume call stack frames for each iteration.