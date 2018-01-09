object fibonacci extends App {

val elem = 4
println(fibonacci(elem))
  def fibonacci(elem: Int): Int =
  {
    if (elem == 0 )
         0
    else if (elem == 1)
      1
    else
      return fibonacci(elem - 1) + fibonacci(elem - 2)
  }
}

