package com.demo.implicits

/**
 * @author Evgeny Borisov
 */
class PrintService {

  def printSomething(implicit string: String): Unit =println(string)

}
