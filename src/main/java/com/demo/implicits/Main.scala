package com.demo.implicits

import TestEnv._

/**
 * @author Evgeny Borisov
 */
object Main {
  def main(args: Array[String]): Unit = {
    val printService = new PrintService
    printService.printSomething
    TestEnv.abc="bkabsdkas"
    printService.printSomething
  }
}
