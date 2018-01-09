object maximum_element extends App {
  val list = List(1, 5, 2, 9, 7)
  var max = 0
  for (i <- list) {
    if (i > max) {
      max = i
    }
  }
  println(max)
}




