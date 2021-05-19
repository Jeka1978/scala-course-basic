package com.demo.implicits.implicit_class

import com.demo.implicits.implicit_class.Extensions.StringExt


/**
 * @author Evgeny Borisov
 */
object Main {

  def main(args: Array[String]): Unit = {
   println("abcgmail.com".isEmail())
  }
}
