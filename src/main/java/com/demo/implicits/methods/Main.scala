package com.demo.implicits.methods


/**
 * @author Evgeny Borisov
 */
object Main {
  def main(args: Array[String]): Unit = {
    val s:String="abc"
    import ImplicitMethods._
    s.printMe()

    12.printMe()
  }
}
