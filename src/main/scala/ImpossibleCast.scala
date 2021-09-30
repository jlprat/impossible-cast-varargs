object ImpossibleCast {
  
    val a = new TypedVarargs[java.lang.Long]()
    val b = z.varArgs(1L) // this works

    val x = new TypedVarargs[Long]()
    val y = x.varArgs(1L) // this throws

    def main(args: Array[String]): Unit = {
        println("runs")
    }

}
