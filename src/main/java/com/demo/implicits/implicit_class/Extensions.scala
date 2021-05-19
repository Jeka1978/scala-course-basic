package com.demo.implicits.implicit_class

import scala.util.Try

/**
 * @author Evgeny Borisov
 */
object Extensions {
  implicit class StringExt(string: String){
    def isEmail():Boolean=string.contains("@")
  }

}
