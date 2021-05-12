package com.demo

/**
 * @author Evgeny Borisov
 */
class StamService(double: Double = 12, double2: Double) {

  def stam(): Unit = {


    val i = ScalaMathFunctions.minus(2, 3)
    val i1: Int = JavaMathFunctions.plus(1, 2)

    new StamService(double2 = 12)
  }

}
