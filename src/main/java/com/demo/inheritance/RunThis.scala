package com.demo.inheritance

/**
 * @author Evgeny Borisov
 */
object RunThis {

  class A(x: Int = 12) {


    def printPretty(): Unit =println(x)
  }

  class B(val x:Int = 10) extends A

  def main(args: Array[String]): Unit = {
    val b = new B()
    b.printPretty()
    println(b.x)
  }

}
