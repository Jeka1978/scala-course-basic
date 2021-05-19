package com.demo.closers

import com.demo.implicits.methods.Person
import com.demo.pattern_matching.Hero

import scala.annotation.tailrec

/**
 * @author Evgeny Borisov
 */
object Main {
  def main(args: Array[String]): Unit = {

    val function: Int => Int = getPlusOneFunction()
    val function2: Double => Person = null
    val function3: Unit => Hero = null

    val i = function(12)

    println(function(12))
  }


  def getPlusOneFunction(): Int => Int = {
    var number: Int = 1

    val plusOne = (x: Int) => x + number

    number += 100

    plusOne

  }


}
