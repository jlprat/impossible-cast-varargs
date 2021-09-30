object ImpossibleCast {
  
    val x = new TypedVarargs[Long]()
    val y = x.varArgs(1L)

    def main(args: Array[String]): Unit = {
        println("runs")
    }

}
