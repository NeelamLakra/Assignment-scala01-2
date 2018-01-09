object String_interpolation extends App{
  val list = List(10,20,30,40,50)

  for(i <- list)
  {
    println(s"${list.indexOf(i)} = $i")
  }


}
